package com.practice.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CalculatorApplicationinitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		XmlWebApplicationContext webapplicationcontext = new XmlWebApplicationContext();
		webapplicationcontext.setConfigLocation("classpath:bean.xml");

		// create a dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webapplicationcontext);

		// registered dispatcher servlet with servlet context
		servletContext.addServlet("myDispatcherServlet", dispatcherServlet);

		// register the dispatcher servlet with the servlet context object
	}

}
