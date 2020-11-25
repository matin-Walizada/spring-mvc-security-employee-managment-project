package com.employee.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


											//For bootstrapping the application.
public class Dispatcher_Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { Dispatcher_Servlet.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}






