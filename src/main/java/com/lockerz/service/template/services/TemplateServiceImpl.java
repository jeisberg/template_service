package com.lockerz.service.template.services;

import com.lockerz.service.template.dao.DaoException;
import com.lockerz.service.template.models.SlugModelImpl;

public class TemplateServiceImpl extends ServiceImpl {

	public SlugModelImpl ping(long id) throws ServiceException {
		// try
		try {
			// return here
			return dao.ping(id);
		// catch and throw here
		} catch(DaoException e) {
			// throw here
			throw new ServiceException(this.getClass().getName() + " -> " + e.getMessage());
		}
	}
}