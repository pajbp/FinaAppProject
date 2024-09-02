package com.anweb.finanace.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.finanace.loan.dto.CustomerDTO;
import com.anweb.finanace.loan.entity.Customer;
import com.anweb.finanace.loan.service.CustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/addCustomer")
	public ResponseEntity<String> registerCustomerData(@RequestBody Customer customer){
		System.out.println("Customer Registerd Data : " + customer);
		customerService.addCustomerData(customer);
		return new ResponseEntity<String>("Customer Added.",HttpStatus.OK);
	}
	
	@GetMapping(value = "/getCustomer/{custuniquenumber}")
	public ResponseEntity<CustomerDTO> getCustomerUsingcustuniquenumber(@PathVariable String custuniquenumber){
		System.out.println("Check unique Number : " + custuniquenumber);
		CustomerDTO customerDTO = customerService.getCustomerData(custuniquenumber);
		return new ResponseEntity<CustomerDTO>(customerDTO,HttpStatus.OK);
	}

	@PutMapping(value = "/updateCustomer")
	public ResponseEntity<String> updateCustomerData(@RequestBody Customer customer){
		System.out.println("Customer updated Data : " + customer);
		customerService.updateCustomerData(customer);
		return new ResponseEntity<String>("Customer updated.",HttpStatus.OK);
	}
	
	//Forgot password.  email address password send or One time password.
	//Reset OR Update password.(email identification old password and new password.)
	
	@PutMapping(value = "/updatePassword")
	public ResponseEntity<String> updatePassword(@RequestParam String email,@RequestParam String oldpassword,@RequestParam String newPassword) {
		System.out.println("Check Password update details : " + email + " " + oldpassword + " " + newPassword);
		customerService.updatePassword(email, oldpassword, newPassword);
		return new ResponseEntity<String>("Password updated.",HttpStatus.OK);
	}
}
