package com.lockerz.service.template.client;

import com.lockerz.service.template.models.SlugModelImpl;

public interface Client {
	
	public SlugModelImpl ping(long id) throws ClientException;
}
