package com.lockerz.service.template.client;

public class ClientException extends Exception {

	private static final long serialVersionUID = 1L;

	public ClientException() {
		// call parent
		super();
	}
	
	public ClientException(String message) {
		// call parent
		super(message);
	}
}
