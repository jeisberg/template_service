package com.lockerz.service.template.controllers;

import org.slf4j.Logger;
import java.io.IOException;
import org.slf4j.LoggerFactory;
import org.codehaus.jackson.map.ObjectMapper;
import javax.servlet.http.HttpServletResponse;
import com.lockerz.service.template.models.SlugModelImpl;
import org.springframework.stereotype.Controller;
import com.lockerz.service.template.services.ServiceImpl;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lockerz.service.template.services.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller @RequestMapping(value="/controller")
public class TemplateServiceControllerImpl extends ServiceControllerImpl {
	
	// create the logger here
	@SuppressWarnings("unused")
	private static Logger LOG = LoggerFactory.getLogger(TemplateServiceControllerImpl.class);
	
	// need these
	public static final String MESSAGE = "message";
	public static final String ERRORCODE = "errorcode";

	@Autowired
    public void setService(ServiceImpl service) {
        // set the point service here
        this.service = service;
    }
	
	@RequestMapping(value="/action")
    public @ResponseBody SlugModelImpl ping(long id) throws ServiceControllerException {
    	// try
    	try {
    		// do the work here
    		return service.ping(id);
    	// catch here and throw
    	} catch(ServiceException e) {
    		// create the message
    		String message = this.getClass().getName() + " -> " + e.getMessage();
    		// throw new exception here
    		throw new ServiceControllerException(e.getErrorCode(), e.getStatus(), message);
    	}
    }
	
	@ExceptionHandler(ServiceControllerException.class)
    // handle all service controller exceptions here and turn to JSON
    public void handleException(ServiceControllerException e, HttpServletResponse response) {
    	// try
        try {
            // set the status here
            response.setStatus(e.getStatus());
        	// add the message here
            response.addHeader(MESSAGE, e.getMessage());
            // add the header here
            response.addIntHeader(ERRORCODE, e.getErrorCode());
            // write the value
            new ObjectMapper().writeValue(response.getWriter(), e);
        // catch here
        } catch (IOException ioe) {
        }
    }
}
