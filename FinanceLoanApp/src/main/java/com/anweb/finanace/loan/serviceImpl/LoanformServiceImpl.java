package com.anweb.finanace.loan.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anweb.finanace.loan.constant.Constants;
import com.anweb.finanace.loan.entity.LoanForm;
import com.anweb.finanace.loan.repo.LoanformRepository;
import com.anweb.finanace.loan.service.LoanformService;

@Service
public class LoanformServiceImpl implements LoanformService{

	@Autowired
	private LoanformRepository loanformRepository;
	
	@Override
	public void applyLoanForm(LoanForm loanForm) {
		// TODO Auto-generated method stub
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
		String createdDate = dateFormat.format(date);
		loanForm.setCreatedDate(createdDate);
		loanForm.setLoanFormStatus(Constants.LOANNEWSTATUS);
		loanformRepository.save(loanForm);
	}

}
