package com.lockerz.service.template.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.io.ClassPathResource;
import com.lockerz.service.template.models.SlugModelImpl;
import com.lockerz.service.template.utilities.PlaceholderConfigurer;

public class TemplateClientImpl extends ClientImpl {
	
	// need this
	private RestTemplate restTemplate = null;
	
	// need this
	private static TemplateClientImpl instance = null;
	
	// need this
	private Properties properties = new Properties();
	
	// constructor
	protected TemplateClientImpl() {
		// create the context here
		this.restTemplate = new RestTemplate();
		// need this
		InputStream in = null;
		// try
		try {
			// get the properties file here
			in = new ClassPathResource(PlaceholderConfigurer.HANDLE + ".properties").getInputStream();
			// sanity check
			if(in != null) {
				// load here
	            properties.load(in);
			}
		// ignore here
		} catch(IOException e) {
		}
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
		String endpoint = properties.getProperty("ping.endpoint");
		// sanity check
		if(endpoint == null) {
			// throw an exception here
			throw new ClientException(this.getClass().getName() + " -> unable to find endpoint");
		}
		// need this
		SlugModelImpl slugModelImpl = null;
		// try
		try {
			// get the result here
			slugModelImpl = (SlugModelImpl) restTemplate.getForObject(endpoint, SlugModelImpl.class);
		// catch and throw here
		} catch(Exception e) {
			// throw new client exception here
			throw new ClientException(this.getClass().getName() + " -> " + e.getMessage());
		}
		// return 
		return slugModelImpl;
	}
}
