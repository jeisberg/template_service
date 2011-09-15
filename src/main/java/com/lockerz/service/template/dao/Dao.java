package com.lockerz.service.template.dao;

import com.lockerz.service.template.models.SlugModelImpl;

public interface Dao {
	
	public SlugModelImpl ping(final long id) throws DaoException;
}
