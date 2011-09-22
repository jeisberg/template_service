package com.lockerz.service.template.dao;

import org.hibernate.Session;

public abstract class DaoFactory {
	
	// need this here
	@SuppressWarnings("rawtypes")
	public static final Class TEMPLATE = com.lockerz.service.template.dao.TemplateDaoFactory.class;
	 
	@SuppressWarnings("rawtypes")
	public static DaoFactory instance(Class factory) {
		// try
		try {
			// return here
            return (DaoFactory) factory.newInstance();
        // catch here
        } catch (Exception ex) {
        	// throw a new exception here
            throw new RuntimeException("cannot create instance of: " + factory);
        }
    }
 
    // Add DAO interfaces here
    public abstract TemplateDaoImpl getTemplateDao(Session session);
}

