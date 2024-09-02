package com.anweb.finanace.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.finanace.loan.dto.CustomerDTO;
import com.anweb.finanace.loan.model.LoginRequest;
import com.anweb.finanace.loan.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping(value = "/login")
	public ResponseEntity<CustomerDTO> getLoginData(@RequestBody LoginRequest loginRequest){
		System.out.println("Check login Data : " + loginRequest);
		CustomerDTO customerDTO = loginService.getLoginData(loginRequest.getUsername(), loginRequest.getPassword());
		return new ResponseEntity<CustomerDTO>(customerDTO,HttpStatus.OK);
	}

}
