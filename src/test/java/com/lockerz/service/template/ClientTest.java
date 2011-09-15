package com.lockerz.service.template;

import com.lockerz.service.template.models.SlugModelImpl;
import com.lockerz.service.template.client.ClientException;
import com.lockerz.service.template.client.TemplateClientImpl;

public class ClientTest {
	
	public static void main(String[] cheese) {
		// need this
		SlugModelImpl slug = null;
		// try
		try {
			// get the data here
			slug = TemplateClientImpl.getInstance().ping(1);
			// output here
			System.out.println("slug.getId(): " + slug.getId());
			// output here
			System.out.println("slug.getMessage(): " + slug.getMessage());
		// catch here
		} catch(ClientException e) {
			// output the exception
			System.out.println(e.getMessage());
		}
	}
}
