package com.lockerz.service.template.utilities;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

public class RestException extends Exception {
	
	// need this
	private static final long serialVersionUID = 1L;
	
	// need this
	private static final int EXCEPTION = 10000;
	
	// need this
	HashMap<Double, String> messages = new HashMap<Double, String>();
	
	// need this
	int httpStatusCode = HttpServletResponse.SC_INTERNAL_SERVER_ERROR;
	
	// need this
	int statusCode = EXCEPTION;

	public RestException() {
		// call parent
		super();
	}
	
	public RestException(String message) {
		// call parent
		super(message);
	}
	
	public RestException(String message, HashMap<Double, String> messages, int httpStatusCode, int statusCode) {
		// call parent
		super(message);
		// set the messages
		this.messages = messages;
		// set the status code
		this.httpStatusCode = httpStatusCode;
		// set the status code
		this.statusCode = statusCode;
	}

	public HashMap<Double, String> getMessages() {
		// return here
		return messages;
	}

	public void setMessages(HashMap<Double, String> messages) {
		// set here
		this.messages = messages;
	}

	public int getHttpStatusCode() {
		// return here
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		// set here
		this.httpStatusCode = httpStatusCode;
	}

	public int getStatusCode() {
		// return here
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		// set here
		this.statusCode = statusCode;
	}
}
