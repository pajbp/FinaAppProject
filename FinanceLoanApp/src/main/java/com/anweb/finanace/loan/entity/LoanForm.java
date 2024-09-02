package com.anweb.finanace.loan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class LoanForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String loanapplicantname;
	
	private String loanApplicationId;//on the basis of current date (today's) ex: 202405231234
	
	private String loanName;
	
	private String loanType;
	
	private double loanAmount;
	
	private double loanEmi;
	
    private int loanTenure;
    
    private float rateofInterest;
    
    private String marritalStatus;
    
    private String age;
    
    private long aadharNumber;
    
    private String pancard;
    
    private String email;
    
    private String contactNo;
    
    private String existingLoan;
    
    private String existiongLoanType;
    
    private String existingLoanAmount;
    
    private String existingLoanRateoFInterest;
    
    private String loanFormStatus;
    
    private String existingLoanEmi;
    
    private String gender;
    
    private String permanentAddress;
    
    private String currentAddress;
    
    private String createdBy;
    
    private String updatedBy;
    
    private String createdDate;
    
    private String updatedDate;
    
    @OneToOne(cascade = CascadeType.ALL)
    private BankDetails bankDetails;
    
    @OneToOne(cascade = CascadeType.ALL)
    private EmploymentDetails employmentDetails;
    
    @OneToOne(cascade = CascadeType.ALL)
    private LegalDocument legalDocument;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanapplicantname() {
		return loanapplicantname;
	}

	public void setLoanapplicantname(String loanapplicantname) {
		this.loanapplicantname = loanapplicantname;
	}

	public String getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(String loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getLoanEmi() {
		return loanEmi;
	}

	public void setLoanEmi(double loanEmi) {
		this.loanEmi = loanEmi;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public float getRateofInterest() {
		return rateofInterest;
	}

	public void setRateofInterest(float rateofInterest) {
		this.rateofInterest = rateofInterest;
	}

	public String getMarritalStatus() {
		return marritalStatus;
	}

	public void setMarritalStatus(String marritalStatus) {
		this.marritalStatus = marritalStatus;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getExistingLoan() {
		return existingLoan;
	}

	public void setExistingLoan(String existingLoan) {
		this.existingLoan = existingLoan;
	}

	public String getExistiongLoanType() {
		return existiongLoanType;
	}

	public void setExistiongLoanType(String existiongLoanType) {
		this.existiongLoanType = existiongLoanType;
	}

	public String getExistingLoanAmount() {
		return existingLoanAmount;
	}

	public void setExistingLoanAmount(String existingLoanAmount) {
		this.existingLoanAmount = existingLoanAmount;
	}

	public String getExistingLoanRateoFInterest() {
		return existingLoanRateoFInterest;
	}

	public void setExistingLoanRateoFInterest(String existingLoanRateoFInterest) {
		this.existingLoanRateoFInterest = existingLoanRateoFInterest;
	}

	public String getLoanFormStatus() {
		return loanFormStatus;
	}

	public void setLoanFormStatus(String loanFormStatus) {
		this.loanFormStatus = loanFormStatus;
	}

	public String getExistingLoanEmi() {
		return existingLoanEmi;
	}

	public void setExistingLoanEmi(String existingLoanEmi) {
		this.existingLoanEmi = existingLoanEmi;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public EmploymentDetails getEmploymentDetails() {
		return employmentDetails;
	}

	public void setEmploymentDetails(EmploymentDetails employmentDetails) {
		this.employmentDetails = employmentDetails;
	}

	public LegalDocument getLegalDocument() {
		return legalDocument;
	}

	public void setLegalDocument(LegalDocument legalDocument) {
		this.legalDocument = legalDocument;
	}

	@Override
	public String toString() {
		return "LoanForm [id=" + id + ", loanapplicantname=" + loanapplicantname + ", loanApplicationId="
				+ loanApplicationId + ", loanName=" + loanName + ", loanType=" + loanType + ", loanAmount=" + loanAmount
				+ ", loanEmi=" + loanEmi + ", loanTenure=" + loanTenure + ", rateofInterest=" + rateofInterest
				+ ", marritalStatus=" + marritalStatus + ", age=" + age + ", aadharNumber=" + aadharNumber
				+ ", pancard=" + pancard + ", email=" + email + ", contactNo=" + contactNo + ", existingLoan="
				+ existingLoan + ", existiongLoanType=" + existiongLoanType + ", existingLoanAmount="
				+ existingLoanAmount + ", existingLoanRateoFInterest=" + existingLoanRateoFInterest
				+ ", loanFormStatus=" + loanFormStatus + ", existingLoanEmi=" + existingLoanEmi + ", gender=" + gender
				+ ", permanentAddress=" + permanentAddress + ", currentAddress=" + currentAddress + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", bankDetails=" + bankDetails + ", employmentDetails=" + employmentDetails
				+ ", legalDocument=" + legalDocument + "]";
	}
   
	
}
