package com.lockerz.service.template.dao;

import org.hibernate.Session;
import com.lockerz.service.template.models.SlugModelImpl;

public class TemplateDaoImpl extends DaoImpl {
	
	public SlugModelImpl ping(final long id) throws DaoException {
		// need this
		Session session = null;
		// try
		try {
			// need this
			session = getHibernateTemplate().getSessionFactory().openSession();
			// return here
			return new SlugModelImpl();
		// catch here
		} catch(Exception e) {
			// create message
			String message = this.getClass().getName() + " -> " + e.getMessage();
			// throw an exception here
			throw new DaoException(message);
		// close the session
		} finally {
			// sanity check
			if(session !=  null && session.isConnected()) {
				// close here
				session.close();
			}
		}
	}
}
