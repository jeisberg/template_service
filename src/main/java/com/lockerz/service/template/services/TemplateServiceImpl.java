package com.lockerz.service.template.services;

import org.hibernate.Session;
import com.lockerz.service.template.dao.DaoImpl;
import com.lockerz.service.template.dao.DaoFactory;
import com.lockerz.service.template.dao.DaoException;
import com.lockerz.service.template.models.SlugModelImpl;

public class TemplateServiceImpl extends ServiceImpl {
	
	public SlugModelImpl ping(long id) throws ServiceException {
		// get the session here
		Session session = hibernateTemplate.getSessionFactory().getCurrentSession();
		// create the factory here
		DaoFactory factory = DaoFactory.instance(DaoFactory.TEMPLATE);
		// create the instance here
		DaoImpl dao = factory.getTemplateDao(session);
		// need this
		SlugModelImpl slug = null;
		// try
		try {
			// call here
			slug = dao.ping(1);
		// catch here
		} catch(DaoException e) {
			// throw a new exception here
			throw new ServiceException(this.getClass().getName() + " -> " + e.getMessage());
		// clean up here
		} finally {
			// close here
			dao.close();
		}
		// return here
		return slug;
	}
}