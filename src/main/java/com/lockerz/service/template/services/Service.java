package com.lockerz.service.template.services;

import com.lockerz.service.template.models.SlugModelImpl;

public interface Service {
	
	// get the user here
	public SlugModelImpl ping(final long id) throws ServiceException;
}
