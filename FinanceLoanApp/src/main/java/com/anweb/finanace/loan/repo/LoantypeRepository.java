package com.anweb.finanace.loan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anweb.finanace.loan.entity.LoanType;

@Repository
public interface LoantypeRepository extends JpaRepository<LoanType, Integer>{

	LoanType findByLoanname(String lname);
	
	List<LoanType> findByLoanamountLessThanEqual(double amount);
	
	List<LoanType> findByLoanamountLessThanEqualOrRateofinterestLessThanEqual(double amount,double rate);
}
