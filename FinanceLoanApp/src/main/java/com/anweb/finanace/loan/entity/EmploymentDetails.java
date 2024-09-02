package com.anweb.finanace.loan.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class EmploymentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String orgnaizationname;
	
	private String organizationaddress;
	
	private String orgnizationcontactno;
	
	private double empsalary;
	
	private String empworkmailid;

	private String orgnizatinemailid;
	
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MMM-dd")
	private Date joinDate;
	
	private int totalExperience;
	
	private int currentOrgnizationexperience;
	
	private String organizationtype;
	
	private String emppayroll;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgnaizationname() {
		return orgnaizationname;
	}

	public void setOrgnaizationname(String orgnaizationname) {
		this.orgnaizationname = orgnaizationname;
	}

	public String getOrganizationaddress() {
		return organizationaddress;
	}

	public void setOrganizationaddress(String organizationaddress) {
		this.organizationaddress = organizationaddress;
	}

	public String getOrgnizationcontactno() {
		return orgnizationcontactno;
	}

	public void setOrgnizationcontactno(String orgnizationcontactno) {
		this.orgnizationcontactno = orgnizationcontactno;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public String getEmpworkmailid() {
		return empworkmailid;
	}

	public void setEmpworkmailid(String empworkmailid) {
		this.empworkmailid = empworkmailid;
	}

	public String getOrgnizatinemailid() {
		return orgnizatinemailid;
	}

	public void setOrgnizatinemailid(String orgnizatinemailid) {
		this.orgnizatinemailid = orgnizatinemailid;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public int getCurrentOrgnizationexperience() {
		return currentOrgnizationexperience;
	}

	public void setCurrentOrgnizationexperience(int currentOrgnizationexperience) {
		this.currentOrgnizationexperience = currentOrgnizationexperience;
	}

	public String getOrganizationtype() {
		return organizationtype;
	}

	public void setOrganizationtype(String organizationtype) {
		this.organizationtype = organizationtype;
	}

	public String getEmppayroll() {
		return emppayroll;
	}

	public void setEmppayroll(String emppayroll) {
		this.emppayroll = emppayroll;
	}

	@Override
	public String toString() {
		return "EmploymentDetails [id=" + id + ", orgnaizationname=" + orgnaizationname + ", organizationaddress="
				+ organizationaddress + ", orgnizationcontactno=" + orgnizationcontactno + ", empsalary=" + empsalary
				+ ", empworkmailid=" + empworkmailid + ", orgnizatinemailid=" + orgnizatinemailid + ", joinDate="
				+ joinDate + ", totalExperience=" + totalExperience + ", currentOrgnizationexperience="
				+ currentOrgnizationexperience + ", organizationtype=" + organizationtype + ", emppayroll=" + emppayroll
				+ "]";
	}
	
}
