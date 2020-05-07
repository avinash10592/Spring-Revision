package com.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.practice.dao.UserDao;
import com.practice.dao.UserDaoImpl;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages ="com.practice")
public class AppConfig {

	// setting up ViewResolver  

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;

	}
	
	@Bean
	DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/database1");
		ds.setUsername("root");
		ds.setPassword("Lakshmi@2");

		return ds;

	}
	@Bean
	public UserDao getUserDao() {
		return new UserDaoImpl(dataSource());
	}

}
