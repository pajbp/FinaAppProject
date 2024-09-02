package com.anweb.finanace.loan.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anweb.finanace.loan.entity.LoanType;
import com.anweb.finanace.loan.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	Optional<Role> findByRolename(String name);
	
	@Query(value = "select rolename from Role")
	List<String> findAllRoleName();
	

}
