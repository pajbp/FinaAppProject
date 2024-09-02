package com.anweb.finanace.loan.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.anweb.finanace.loan.constant.Constants;
import com.anweb.finanace.loan.dto.CustomerDTO;
import com.anweb.finanace.loan.entity.Customer;
import com.anweb.finanace.loan.exception.CustomerNotFoundException;
import com.anweb.finanace.loan.exception.PasswordNotMatchedException;
import com.anweb.finanace.loan.repo.CustomerRepository;
import com.anweb.finanace.loan.service.CustomerService;
import com.anweb.finanace.loan.utility.ConvertPojoToDTO;
import com.anweb.finanace.loan.utility.UniqueCustomerNumberGenerator;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void addCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer Data Storing start.");
		String uniqueNumber = UniqueCustomerNumberGenerator.getUniqueCustomerNumber(customer.getPancard(),customer.getCustmonumber());
		customer.setCustuniquenumber(uniqueNumber);
		customer.setStatus(Constants.ACTIVESTATUS);
		customerRepository.save(customer);
		//mail sending code.
	}

	@Override
	public CustomerDTO getCustomerData(String custuniquenumber) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findByCustuniquenumber(custuniquenumber);
		CustomerDTO customerDTO = ConvertPojoToDTO.getCustomerDTO(customer);
		if(!ObjectUtils.isEmpty(customer)) {
			return customerDTO;
		}
		throw new CustomerNotFoundException("Customer Not Found For  : " + custuniquenumber);
	}

	@Override
	public void updateCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Updating Customer Data  :  " + customer);
		//To set Password to existing customer Data.
		Customer customer2 = customerRepository.findByCustuniquenumber(customer.getCustuniquenumber());
		customer.setPassword(customer2.getPassword());
		customerRepository.save(customer);
	}

	@Override
	@Transactional
	public void updatePassword(String email, String oldpassword, String newPassword) {
		// TODO Auto-generated method stub
		System.out.println("Getting Customer Using Email Start : ");
		Customer customer = customerRepository.findByEmail(email);
		if(customer != null) {
			if(customer.getPassword().equals(oldpassword)) {
				customerRepository.updatePassword(email, newPassword);
			}else {
				throw new PasswordNotMatchedException("Password Does Not Matched.");
			}
		} else{
			throw new CustomerNotFoundException("Customer not Found For : " + email);
		}
	}

}
