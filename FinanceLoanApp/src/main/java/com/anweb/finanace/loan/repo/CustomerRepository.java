package com.anweb.finanace.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anweb.finanace.loan.entity.Customer;
import java.lang.String;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
	Customer findByCustuniquenumber(String custuniquenumber);
	
	Customer findByEmail(String email);
	
	@Modifying
	@Query("update Customer c set c.password=:ps where c.email=:emailId")
	void updatePassword(@Param("emailId") String email,@Param("ps")String newPassword);
	
	Customer findByEmailAndPasswordAndStatus(String username,String password,boolean status);

	@Query(value = "select username from Customer")
    List<String> findByUsernames();

	
	Customer findByUsername(String username);
}
