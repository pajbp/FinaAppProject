package com.anweb.finanace.loan.service;

import com.anweb.finanace.loan.dto.CustomerDTO;

public interface LoginService {
	
	CustomerDTO getLoginData(String username,String pass);

}
