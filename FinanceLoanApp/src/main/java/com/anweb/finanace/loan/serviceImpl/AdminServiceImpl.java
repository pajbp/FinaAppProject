package com.anweb.finanace.loan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.finanace.loan.entity.Customer;
import com.anweb.finanace.loan.entity.Role;
import com.anweb.finanace.loan.exception.CustomerNotFoundException;
import com.anweb.finanace.loan.repo.CustomerRepository;
import com.anweb.finanace.loan.repo.RoleRepository;
import com.anweb.finanace.loan.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<String> getAllUsernames() {
		// TODO Auto-generated method stub
		return customerRepository.findByUsernames();
	}

	@Override
	public List<String> getAllRolnames() {
		// TODO Auto-generated method stub
		return roleRepository.findAllRoleName();
	}

	@Override
	public void assignRoleToUser(String username, String rolename) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findByUsername(username);
		if(customer != null) {
			  Role role = roleRepository.findByRolename(rolename).get();
			  customer.setRole(role);
			  customerRepository.save(customer);
		}
		else {
			throw new CustomerNotFoundException("Customer not Found For : " + username );
		}
	}

}
