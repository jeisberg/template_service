package com.lockerz.service.template.dao;

import com.lockerz.service.template.dao.Dao;

import org.hibernate.Session;

public abstract class DaoImpl implements Dao {

	protected Session session;
	
	public void setSession(Session session) {
		// set here
		this.session = session;
	}	
}
