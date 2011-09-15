package com.lockerz.service.template.services;

import com.lockerz.service.template.dao.DaoImpl;

public abstract class ServiceImpl implements Service {
	
protected DaoImpl dao;
	
	public void setDao(DaoImpl dao) {
		// set the access here
		this.dao = dao;
	}
}
