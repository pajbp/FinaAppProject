package com.anweb.finanace.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String bankName;
	
	private String bankAddress;
	
	private String bankemail;
	
	private String bankcontactno;
	
	private String bankfax;
	
	private String bankifsccode;
	
	private String bankaccountnumber;
	
    private String bankaccountholdername;
    
    private String bankaccounttype;
    
    private String atmcardnumber;
    
    private String branchname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankemail() {
		return bankemail;
	}

	public void setBankemail(String bankemail) {
		this.bankemail = bankemail;
	}

	public String getBankcontactno() {
		return bankcontactno;
	}

	public void setBankcontactno(String bankcontactno) {
		this.bankcontactno = bankcontactno;
	}

	public String getBankfax() {
		return bankfax;
	}

	public void setBankfax(String bankfax) {
		this.bankfax = bankfax;
	}

	public String getBankifsccode() {
		return bankifsccode;
	}

	public void setBankifsccode(String bankifsccode) {
		this.bankifsccode = bankifsccode;
	}

	public String getBankaccountnumber() {
		return bankaccountnumber;
	}

	public void setBankaccountnumber(String bankaccountnumber) {
		this.bankaccountnumber = bankaccountnumber;
	}

	public String getBankaccountholdername() {
		return bankaccountholdername;
	}

	public void setBankaccountholdername(String bankaccountholdername) {
		this.bankaccountholdername = bankaccountholdername;
	}

	public String getBankaccounttype() {
		return bankaccounttype;
	}

	public void setBankaccounttype(String bankaccounttype) {
		this.bankaccounttype = bankaccounttype;
	}

	public String getAtmcardnumber() {
		return atmcardnumber;
	}

	public void setAtmcardnumber(String atmcardnumber) {
		this.atmcardnumber = atmcardnumber;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", bankName=" + bankName + ", bankAddress=" + bankAddress + ", bankemail="
				+ bankemail + ", bankcontactno=" + bankcontactno + ", bankfax=" + bankfax + ", bankifsccode="
				+ bankifsccode + ", bankaccountnumber=" + bankaccountnumber + ", bankaccountholdername="
				+ bankaccountholdername + ", bankaccounttype=" + bankaccounttype + ", atmcardnumber=" + atmcardnumber
				+ ", branchname=" + branchname + "]";
	}
    
    

}
