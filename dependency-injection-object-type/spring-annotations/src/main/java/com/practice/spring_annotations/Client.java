package com.practice.spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		System.out.println("The college object created by Spring is : " + college);
		college.test();
		context.close();

	}
}
