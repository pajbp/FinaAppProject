package com.anweb.finanace.loan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.finanace.loan.dto.CustomerDTO;
import com.anweb.finanace.loan.entity.Customer;
import com.anweb.finanace.loan.exception.InvalidUsernameAndPasswordException;
import com.anweb.finanace.loan.exception.RoleIsNotAssignException;
import com.anweb.finanace.loan.repo.CustomerRepository;
import com.anweb.finanace.loan.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerDTO getLoginData(String username, String pass) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findByEmailAndPasswordAndStatus(username, pass, true);
		System.out.println("Check Customer Details : " + customer);
		if(customer != null) {
			if(customer.getRole() != null) {
				CustomerDTO customerDTO = new CustomerDTO();
				customerDTO.setCustuniquenumber(customer.getCustuniquenumber());
				customerDTO.setCustname(customer.getCustname());
				customerDTO.setEmail(customer.getEmail());
				customerDTO.setUsername(customer.getUsername());
				customerDTO.setRole(customer.getRole());
				return customerDTO;
			}
			else {
				throw new RoleIsNotAssignException("Role Not Found For Customer : " + username);
			}
		}else {
			throw new InvalidUsernameAndPasswordException("Invalid Credentials For : " +username);
		}

	}

}
