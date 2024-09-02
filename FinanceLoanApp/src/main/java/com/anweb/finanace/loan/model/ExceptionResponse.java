package com.anweb.finanace.loan.model;

public class ExceptionResponse {

	private String uri;
	
	private String errorMsg;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [uri=" + uri + ", errorMsg=" + errorMsg + "]";
	}
	
	
	
}
