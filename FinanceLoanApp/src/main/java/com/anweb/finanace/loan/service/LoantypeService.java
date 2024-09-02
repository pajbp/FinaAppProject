package com.anweb.finanace.loan.service;

import java.util.List;

import com.anweb.finanace.loan.entity.LoanType;

public interface LoantypeService {

	
	void addLoanTypeData(LoanType loanType);
	
	LoanType findLoanDataUsingname(String lname);
	
	List<LoanType> getAllLoanTypeData();
	
	void updatingLoanData(LoanType loanType);
	
	void deleteLoanTypeDatausingId(int id);
	
	List<LoanType> getLoanDataUsingAmount(double amount);
	
	List<LoanType> getLoanDataUsingAmountORrate(double amount,double rate);
}
