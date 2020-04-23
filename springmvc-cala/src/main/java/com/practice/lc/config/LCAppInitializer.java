package com.practice.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	// setting up configuration class
	@Override
	protected Class<?>[] getServletConfigClasses() {

		Class arr[] = { LoveCalculatorAppConfig.class };
		return arr;
	}

	// configuring mapping for dispatcher Servlet
	@Override
	protected String[] getServletMappings() {
		// String arr[]= {"/mywebsite.com/*"};
		String arr[] = { "/" };

		return arr;
	}

}
