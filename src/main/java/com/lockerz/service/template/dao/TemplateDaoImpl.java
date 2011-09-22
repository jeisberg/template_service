package com.lockerz.service.template.dao;

import org.hibernate.Session;
import com.lockerz.service.template.models.SlugModelImpl;

public class TemplateDaoImpl extends DaoImpl {

	public TemplateDaoImpl() {
		// super here
		super();
	}
	
	public TemplateDaoImpl(Session session) {
		// super here
		super();
		// set the session here
		setSession(session);
		// start the session
		session.beginTransaction();
	}
	
	public SlugModelImpl ping(final long id) throws DaoException {
		// return here
		return new SlugModelImpl();
	}
	
	public void close() {
		// commit the transaction
		session.getTransaction().commit();
	}
}
