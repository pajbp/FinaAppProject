package com.anweb.finanace.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.finanace.loan.model.RoleAssign;
import com.anweb.finanace.loan.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping(value = "/getAllRoleNames")
	public ResponseEntity<List<String>> getAllRoleNames(){
		System.out.println("Fetching All Rolename Data :");
		List<String> sname = adminService.getAllRolnames();
		return new ResponseEntity<List<String>>(sname,HttpStatus.OK);
	}

	@GetMapping(value = "/getAllUsernames")
	public ResponseEntity<List<String>> getAllUsernames(){
		System.out.println("Fetching All Usernames Data :");
		List<String> sname = adminService.getAllUsernames();
		return new ResponseEntity<List<String>>(sname,HttpStatus.OK);
	}
	
	@PostMapping(value = "/assignRole")
	public ResponseEntity<String> assignRoleToUser(@RequestBody RoleAssign roleAssign){
		System.out.println("Role Assign Data : " + roleAssign);
		adminService.assignRoleToUser(roleAssign.getUsername(), roleAssign.getRolename());
		return new ResponseEntity<String>("Role Assigned To User.",HttpStatus.OK);
	}
}
