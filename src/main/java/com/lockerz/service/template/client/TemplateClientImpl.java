package com.lockerz.service.template.client;

import org.springframework.web.client.RestTemplate;
import com.lockerz.service.template.models.SlugModelImpl;

public class TemplateClientImpl extends ClientImpl {
	
	// need this
	private RestTemplate restTemplate = null;
	
	// need this
	private static TemplateClientImpl instance = null;
	
	// constructor
	protected TemplateClientImpl() {
		// create the context here
		this.restTemplate = new RestTemplate();
	}
	  
	// get the instance here
	public static TemplateClientImpl getInstance() {
		// sanity check
		if(instance == null) {
			// create the instance
	        instance = new TemplateClientImpl();
	    }
	    // return here
		return instance;
	}
	
	public SlugModelImpl ping(long id) throws ClientException {
		// need this
		String url = "http://localhost:8080/template_service-1.0-SNAPSHOT/controller/action/?id=12";
		// need this
		SlugModelImpl slugModelImpl = null;
		// try
		try {
			// get the result here
			slugModelImpl = (SlugModelImpl) restTemplate.getForObject(url, SlugModelImpl.class);
		// catch and throw here
		} catch(Exception e) {
			// throw new client exception here
			throw new ClientException(this.getClass().getName() + " -> " + e.getMessage());
		}
		// return 
		return slugModelImpl;
	}
}
