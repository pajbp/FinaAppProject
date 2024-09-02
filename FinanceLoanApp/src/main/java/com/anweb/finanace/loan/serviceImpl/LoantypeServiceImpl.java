package com.anweb.finanace.loan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.finanace.loan.entity.LoanType;
import com.anweb.finanace.loan.repo.LoantypeRepository;
import com.anweb.finanace.loan.service.LoantypeService;

@Service
public class LoantypeServiceImpl implements LoantypeService {

	@Autowired
	private LoantypeRepository loantypeRepository;
	
	@Override
	public void addLoanTypeData(LoanType loanType) {
		// TODO Auto-generated method stub
		System.out.println("Loan Data In repository : " + loanType);
		loantypeRepository.save(loanType);
	}

	@Override
	public LoanType findLoanDataUsingname(String lname) {
		// TODO Auto-generated method stub
		LoanType loanType = loantypeRepository.findByLoanname(lname);
		return loanType;
	}

	@Override
	public List<LoanType> getAllLoanTypeData() {
		// TODO Auto-generated method stub
		return loantypeRepository.findAll();
	}

	@Override
	public void updatingLoanData(LoanType loanType) {
		// TODO Auto-generated method stub
		System.out.println("Check Updating loan Data : " + loanType);
		loantypeRepository.save(loanType);
	}

	@Override
	public void deleteLoanTypeDatausingId(int id) {
		// TODO Auto-generated method stub
		System.out.println("Deleting loan type data for  : " + id);
		loantypeRepository.deleteById(id);
		
	}

	@Override
	public List<LoanType> getLoanDataUsingAmount(double amount) {
		// TODO Auto-generated method stub
		List<LoanType> loanTypes = loantypeRepository.findByLoanamountLessThanEqual(amount);
		System.out.println("Check Loan Dasta By Amount : " + loanTypes);
		return loanTypes;
	}

	@Override
	public List<LoanType> getLoanDataUsingAmountORrate(double amount, double rate) {
		// TODO Auto-generated method stub
		return loantypeRepository.findByLoanamountLessThanEqualOrRateofinterestLessThanEqual(amount, rate);
	}
 
}
