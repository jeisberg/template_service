package com.lockerz.service.template.services;

import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class ServiceImpl implements Service {
	
	protected HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		// set the template here
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		// return the template here
		return hibernateTemplate;
	}
}
