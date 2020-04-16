package com.practice.spring_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice.spring_annotations")
public class CollegeConfig {
	
//	@Bean
//	public Teacher mathTeacherBean(){
//		return new MathTeacher();
//	}
//
//	@Bean
//	public Principal principalBean(){
//		return new Principal();
//	}
//	
//	@Bean
//	public College collegeBean() {  // collegeBean --- Bean id
//		College college = new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}
}
