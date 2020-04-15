package com.practice.dependency_injection_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("bean.xml file loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();

		AnotherStudent anotherstudent = context.getBean("anotherstudent", AnotherStudent.class);
		anotherstudent.startCheating();
	}
}
