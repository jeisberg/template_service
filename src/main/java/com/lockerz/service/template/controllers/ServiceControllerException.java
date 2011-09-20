package com.lockerz.service.template.controllers;

import java.util.HashMap;
import com.lockerz.service.template.utilities.RestException;

public class ServiceControllerException extends RestException {

	// need this
	private static final long serialVersionUID = 1L;
	
	public ServiceControllerException(String message) {
		// call parent
		super(message);
	}
	
	public ServiceControllerException(String message, HashMap<Double, String> messages, int httpStatusCode, int statusCode) {
		// call parent
		super(message, messages, httpStatusCode, statusCode);
	}
}