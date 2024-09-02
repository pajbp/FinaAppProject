package com.anweb.finanace.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.finanace.loan.entity.Role;
import com.anweb.finanace.loan.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	//@PostConstruct@PostPersist@PostRemove@PostUpdate@PostLoad
	@PostMapping(value = "/addRole")
	public ResponseEntity<String> storeRole(@RequestBody Role role){
		System.out.println("Storing Role Data : " + role);
		roleService.addRoleData(role);
		return new ResponseEntity<String>("Role Data Added.",HttpStatus.OK);
	}
	
	@GetMapping(value = "/getRole/{rolename}")
	public ResponseEntity<Role> getSingleRoleDataUsingRolename(@PathVariable("rolename") String name){
		System.out.println("Check Role Is exist or not : " + name);
		Role role = roleService.getRoleDataUsingRolename(name);
		return new ResponseEntity<Role>(role,HttpStatus.OK);
	}
	
	//Write 3 Api here i. Get All Role Data. ii. update Role. iii.Get All Only List<RoleName> Data.
	
	@GetMapping(value = "/getAllRoles")
	public ResponseEntity<List<Role>> getAllRoleData(){
		System.out.println("Role Data Fetching Strat:");
		List<Role> roles = roleService.getAllRoleData();
		return new ResponseEntity<List<Role>>(roles,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateRole")
	public ResponseEntity<String> updateRole(@RequestBody Role role){
		System.out.println("Updating Role Data : " + role);
		roleService.updatingRoleData(role);
		return new ResponseEntity<String>("Role updated Added.",HttpStatus.OK);
	}
	
//	@GetMapping(value = "/getAllRoleNames")
//	public ResponseEntity<List<String>> getAllRoleNames(){
//		System.out.println("Fetching Rolename Data :");
//		List<String> sname = roleService.getRoleNameData();
//		return new ResponseEntity<List<String>>(sname,HttpStatus.OK);
//	}
}
