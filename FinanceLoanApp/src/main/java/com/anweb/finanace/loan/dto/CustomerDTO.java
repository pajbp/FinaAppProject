package com.anweb.finanace.loan.dto;

import com.anweb.finanace.loan.entity.Address;
import com.anweb.finanace.loan.entity.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO {

	@JsonInclude(Include.NON_DEFAULT)
    private int id;
	
	private String custname;
	
	private String custuniquenumber;
	
	private String custmonumber;
	
	@JsonInclude(Include.NON_DEFAULT)
	private long aadharnumber;
	
	private String pancard;
	
	private String email;
	
	private String username;
	
	@JsonInclude(Include.NON_DEFAULT)
	private boolean status;
	
	private Address address;
	
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
	
	
}
