package com.anweb.finanace.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String permnent;
	
	private String current;
	
	private String landmark;
	
	private String state;
	
	private String city;
	
	private String district;
	
	private String country;
	
	private int pincode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPermnent() {
		return permnent;
	}

	public void setPermnent(String permnent) {
		this.permnent = permnent;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
