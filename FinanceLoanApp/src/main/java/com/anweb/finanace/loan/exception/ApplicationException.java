package com.anweb.finanace.loan.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anweb.finanace.loan.model.ExceptionResponse;

@ControllerAdvice
public class ApplicationException {

	@ExceptionHandler(RoleNotFound.class)
	public @ResponseBody ExceptionResponse handleExceptionOne(HttpServletRequest request,RoleNotFound exception) {

		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI());
		exceptionResponse.setErrorMsg(exception.getMessage());
		return exceptionResponse;	
	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public @ResponseBody ExceptionResponse handleExceptionTwo(HttpServletRequest request,CustomerNotFoundException exception) {

		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI());
		exceptionResponse.setErrorMsg(exception.getMessage());
		return exceptionResponse;	
	}

	
	@ExceptionHandler(InvalidUsernameAndPasswordException.class)
	public @ResponseBody ExceptionResponse handleExceptionThree(HttpServletRequest request,InvalidUsernameAndPasswordException exception) {

		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI());
		exceptionResponse.setErrorMsg(exception.getMessage());
		return exceptionResponse;	
	}
	
	@ExceptionHandler(RoleIsNotAssignException.class)
	public @ResponseBody ExceptionResponse handleExceptionFour(HttpServletRequest request,RoleIsNotAssignException exception) {

		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setUri(request.getRequestURI());
		exceptionResponse.setErrorMsg(exception.getMessage());
		return exceptionResponse;	
	}
}
