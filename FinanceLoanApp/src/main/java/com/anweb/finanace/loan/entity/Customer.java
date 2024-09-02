package com.anweb.finanace.loan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DynamicUpdate
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String custname;
	
	private String custuniquenumber;
	
	private String custmonumber;
	
	private long aadharnumber;
	
	private String pancard;
	
	private String email;
	
	private String username;
	
	//@JsonIgnore
	private String password;
	
	@Type(type = "yes_no")
	private boolean status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Role role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustuniquenumber() {
		return custuniquenumber;
	}

	public void setCustuniquenumber(String custuniquenumber) {
		this.custuniquenumber = custuniquenumber;
	}

	public String getCustmonumber() {
		return custmonumber;
	}

	public void setCustmonumber(String custmonumber) {
		this.custmonumber = custmonumber;
	}

	public long getAadharnumber() {
		return aadharnumber;
	}

	public void setAadharnumber(long aadharnumber) {
		this.aadharnumber = aadharnumber;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", custname=" + custname + ", custuniquenumber=" + custuniquenumber
				+ ", custmonumber=" + custmonumber + ", aadharnumber=" + aadharnumber + ", pancard=" + pancard
				+ ", email=" + email + ", username=" + username + ", password=" + password + ", status=" + status
				+ ", address=" + address + ", role=" + role + "]";
	}
	
	

}
