package com.practice.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student avi = context.getBean("stu1", Student.class);
		avi.displayStudentInfo();

		Student riyaz = context.getBean("stu2", Student.class);
		riyaz.displayStudentInfo();

	}
}
