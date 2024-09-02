package com.anweb.finanace.loan.service;

import java.util.List;

public interface AdminService {
	
	List<String> getAllUsernames();
	
	List<String> getAllRolnames();
	
	void assignRoleToUser(String username,String rolename);

}
