package com.practice.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class College {

	@Value("KMIT")
	private String collegeName;

	@Autowired
	private Principal principal;

	@Autowired
	private Teacher teacher;

	// Using Constructor Injection
	// public College(Principal principal) {
	// this.principal = principal;
	// }

	// public void setTeacher(Teacher teacher) {
	// this.teacher = teacher;
	// }
	//
	//
	// // Using Setter injection
	// public void setPrincipal(Principal principal) {
	// this.principal = principal;
	// }

	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is :" + collegeName);
		System.out.println("testing this method");
	}

}
