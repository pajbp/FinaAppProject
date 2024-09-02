package com.anweb.finanace.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.finanace.loan.entity.LoanForm;
import com.anweb.finanace.loan.service.LoanformService;

@RestController
public class LoanFormController {
	
	
	@Autowired
	private LoanformService loanformService;
	
	@PostMapping(value = "/applyloan")
	public String applyLoan(@RequestBody LoanForm loanForm) {
		System.out.println("Check Loan Form Data : " + loanForm);
		loanformService.applyLoanForm(loanForm);
		return "Loan Apply Completed.";
	}

}
