package com.anweb.finanace.loan.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.anweb.finanace.loan.entity.Role;
import com.anweb.finanace.loan.exception.RoleNotFound;
import com.anweb.finanace.loan.repo.RoleRepository;
import com.anweb.finanace.loan.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void addRoleData(Role role) {
		// TODO Auto-generated method stub
		System.out.println("Check Role Data : " + role);
		roleRepository.save(role);
	}

	@Override
	public Role getRoleDataUsingRolename(String name) {
		// TODO Auto-generated method stub
		//What is ObjectUtils ?
		Optional<Role> optional = roleRepository.findByRolename(name);
		if(optional.isPresent()) {
			return optional.get();
		}
		throw new RoleNotFound("Role Not Exist.");
	}

	@Override
	public List<Role> getAllRoleData() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public void updatingRoleData(Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

//	@Override
//	public List<String> getRoleNameData() {
//		// TODO Auto-generated method stub
//		List<String> rolenames = roleRepository.findAllRoleName();
//		System.out.println(rolenames);
//		return rolenames;
//	}

}
