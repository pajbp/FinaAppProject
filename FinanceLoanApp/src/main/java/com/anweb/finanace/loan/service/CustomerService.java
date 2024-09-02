package com.anweb.finanace.loan.service;

import com.anweb.finanace.loan.dto.CustomerDTO;
import com.anweb.finanace.loan.entity.Customer;

public interface CustomerService {

	void addCustomerData(Customer customer);
	
	CustomerDTO getCustomerData(String custuniquenumber);
	
	void updateCustomerData(Customer customer);
	
	void updatePassword(String email,String oldpassword,String newPassword);
}
