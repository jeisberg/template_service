package com.lockerz.service.template.models;

public class SlugModelImpl extends ModelImpl {

	int id = -1;
	String message = "I'm a slug!";
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
