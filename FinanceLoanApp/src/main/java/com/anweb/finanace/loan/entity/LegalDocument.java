package com.anweb.finanace.loan.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class LegalDocument {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Lob
	private byte[] aadharcard;
	
	@Lob
	private byte[] pancard;
	
	@Lob
	private byte[] salarySlip;
	
	@Lob
	private byte[] bankstatement;
	
	@Lob
	private byte[] lightbill;
	
	@Lob
	private byte[] rentagreement;
	
	@Lob
	private byte[] joinletter;
	
	@Lob
	private byte[] photo;
	
	@Lob
	private byte[] sign;

	@Lob
	private byte[] bankpassbook;
	
	@Lob
	private byte[] idcard;
	
	@Lob
	private byte[] gasreceipt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(byte[] aadharcard) {
		this.aadharcard = aadharcard;
	}

	public byte[] getPancard() {
		return pancard;
	}

	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}

	public byte[] getSalarySlip() {
		return salarySlip;
	}

	public void setSalarySlip(byte[] salarySlip) {
		this.salarySlip = salarySlip;
	}

	public byte[] getBankstatement() {
		return bankstatement;
	}

	public void setBankstatement(byte[] bankstatement) {
		this.bankstatement = bankstatement;
	}

	public byte[] getLightbill() {
		return lightbill;
	}

	public void setLightbill(byte[] lightbill) {
		this.lightbill = lightbill;
	}

	public byte[] getRentagreement() {
		return rentagreement;
	}

	public void setRentagreement(byte[] rentagreement) {
		this.rentagreement = rentagreement;
	}

	public byte[] getJoinletter() {
		return joinletter;
	}

	public void setJoinletter(byte[] joinletter) {
		this.joinletter = joinletter;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getSign() {
		return sign;
	}

	public void setSign(byte[] sign) {
		this.sign = sign;
	}

	public byte[] getBankpassbook() {
		return bankpassbook;
	}

	public void setBankpassbook(byte[] bankpassbook) {
		this.bankpassbook = bankpassbook;
	}

	public byte[] getIdcard() {
		return idcard;
	}

	public void setIdcard(byte[] idcard) {
		this.idcard = idcard;
	}

	public byte[] getGasreceipt() {
		return gasreceipt;
	}

	public void setGasreceipt(byte[] gasreceipt) {
		this.gasreceipt = gasreceipt;
	}

	@Override
	public String toString() {
		return "LegalDocument [id=" + id + ", aadharcard=" + Arrays.toString(aadharcard) + ", pancard="
				+ Arrays.toString(pancard) + ", salarySlip=" + Arrays.toString(salarySlip) + ", bankstatement="
				+ Arrays.toString(bankstatement) + ", lightbill=" + Arrays.toString(lightbill) + ", rentagreement="
				+ Arrays.toString(rentagreement) + ", joinletter=" + Arrays.toString(joinletter) + ", photo="
				+ Arrays.toString(photo) + ", sign=" + Arrays.toString(sign) + ", bankpassbook="
				+ Arrays.toString(bankpassbook) + ", idcard=" + Arrays.toString(idcard) + ", gasreceipt="
				+ Arrays.toString(gasreceipt) + "]";
	}
	
	
}
