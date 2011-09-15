package com.lockerz.service.template.services;

import javax.servlet.http.HttpServletResponse;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	protected int status = HttpServletResponse.SC_INTERNAL_SERVER_ERROR; 
	protected int errorCode = 0;
	
	public ServiceException() {
		// call parent
		super();
	}
	
	public ServiceException(String message) {
		// call parent
		super(message);
	}
	
	public ServiceException(int errorCode, int status, String message) {
		// call parent
		super(message);
		// set the error code
		this.setErrorCode(errorCode);
		// set the status
		this.setStatus(status);
	}
	
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
}
