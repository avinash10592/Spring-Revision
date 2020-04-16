package com.practice.spring_annotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("Hi I am your MathTeacher");
		System.out.println("My name is Riraz");

	}

}
