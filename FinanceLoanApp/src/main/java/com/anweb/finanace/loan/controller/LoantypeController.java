package com.anweb.finanace.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anweb.finanace.loan.entity.LoanType;
import com.anweb.finanace.loan.service.LoantypeService;

@RestController
public class LoantypeController {
	
	
	@Autowired
	private LoantypeService loantypeService;
	
	@PostMapping(value = "/addLoan")
	public ResponseEntity<String> addingLoanTypeData(@RequestBody LoanType loanType){
		System.out.println("Check Loan Data : " + loanType);
		loantypeService.addLoanTypeData(loanType);
		return new ResponseEntity<String>("Loan Type Data Added.",HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/{loanname}")
	public ResponseEntity<LoanType> getLoanData(@PathVariable String loanname) {
		System.out.println("Check loan type data : " + loanname);
		LoanType loanType = loantypeService.findLoanDataUsingname(loanname);
		return new ResponseEntity<LoanType>(loanType,HttpStatus.OK);		
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<List<LoanType>> getAllloanData(){
		System.out.println("Start Fetching All Loan Data : --- > ");
		List<LoanType> loanList = loantypeService.getAllLoanTypeData();
	    return new ResponseEntity<List<LoanType>>(loanList,HttpStatus.OK);
	    		
	}
	
	@PutMapping(value = "/updateloan")
	public ResponseEntity<String> updateLoanTypeData(@RequestBody LoanType loanType){
		System.out.println("Updating Loan Data : " + loanType);
		loantypeService.updatingLoanData(loanType);
		return new ResponseEntity<String>("Loan Type Data Updated.",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteLoan/{id}")
	public ResponseEntity<String> deleteLoanTypeData(@PathVariable int id){
		System.out.println("Check Loan type id : " + id);
		loantypeService.deleteLoanTypeDatausingId(id);
		return new ResponseEntity<String>("Loan type deleted.",HttpStatus.OK);
	}
	
	@GetMapping(value = "/getloanbyamount/{loanamount}")
	public ResponseEntity<List<LoanType>> getLoanDataUsingAmount(@PathVariable double loanamount){
		List<LoanType> loantypeList = loantypeService.getLoanDataUsingAmount(loanamount);
		return new ResponseEntity<List<LoanType>>(loantypeList,HttpStatus.OK);
	}
	
	@GetMapping(value = "/getloanbyamount/{loanamount}/{rate}")
	public ResponseEntity<List<LoanType>> getLoanDataUsingAmountORLoanInterest(@PathVariable double loanamount,@PathVariable double rate){
		List<LoanType> loantypeList = loantypeService.getLoanDataUsingAmountORrate(loanamount, rate);
		return new ResponseEntity<List<LoanType>>(loantypeList,HttpStatus.OK);
	}
	
}
