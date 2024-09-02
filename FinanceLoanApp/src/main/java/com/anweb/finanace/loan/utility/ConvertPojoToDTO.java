package com.anweb.finanace.loan.utility;

import com.anweb.finanace.loan.dto.CustomerDTO;
import com.anweb.finanace.loan.entity.Customer;

public class ConvertPojoToDTO {
	
	public static CustomerDTO getCustomerDTO(Customer customer) {
		
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(customer.getId());
		customerDTO.setCustname(customer.getCustname());
		customerDTO.setCustuniquenumber(customer.getCustuniquenumber());
		customerDTO.setCustmonumber(customer.getCustmonumber());
		customerDTO.setAadharnumber(customer.getAadharnumber());
		customerDTO.setEmail(customer.getEmail());
		customerDTO.setPancard(customer.getPancard());
		customerDTO.setAddress(customer.getAddress());
		customerDTO.setStatus(customer.isStatus());
		customerDTO.setUsername(customer.getUsername());
		
		return customerDTO;
	}

}
