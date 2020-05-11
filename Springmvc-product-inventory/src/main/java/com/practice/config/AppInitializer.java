package com.practice.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	// setting up configuration class
	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class arr[] = { AppConfig.class };
		return arr;
	}

	// configuring mapping for dispatcher Servlet
	@Override
	protected String[] getServletMappings() {
		String arr[] = { "/" };

		return arr;
	}

}
