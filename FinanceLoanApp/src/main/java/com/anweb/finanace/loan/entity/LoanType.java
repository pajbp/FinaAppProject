package com.anweb.finanace.loan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(unique = true, nullable = false)
	private String loanname;
	
	private double loanamount;
	
	private String ltype;
	
	private double rateofinterest;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanname() {
		return loanname;
	}

	public void setLoanname(String loanname) {
		this.loanname = loanname;
	}

	public double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}

	public String getLtype() {
		return ltype;
	}

	public void setLtype(String ltype) {
		this.ltype = ltype;
	}

	
	public double getRateofinterest() {
		return rateofinterest;
	}

	public void setRateofinterest(double rateofinterest) {
		this.rateofinterest = rateofinterest;
	}

	@Override
	public String toString() {
		return "LoanType [id=" + id + ", loanname=" + loanname + ", loanamount=" + loanamount + ", ltype=" + ltype
				+ ", rateofinterest=" + rateofinterest + "]";
	}

	
}
