package com.anweb.finanace.loan.service;

import java.util.List;

import com.anweb.finanace.loan.entity.Role;

public interface RoleService {

	
	void addRoleData(Role role);
	
	Role getRoleDataUsingRolename(String name);
	
	List<Role> getAllRoleData();
	
	void updatingRoleData(Role role);
	
	//List<String> getRoleNameData();
}
