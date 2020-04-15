package com.practice.dependencyinjection;

public class Student {

	private int id;
	private String studentName;

	// Using Constructor Injection
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	// Using Setter Injection
	// public void setId(int id) {
	// this.id = id;
	// }
	//
	// public void setStudentName(String studentName) {
	// this.studentName = studentName;
	// }

	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName + " and the id is : " + id);
	}

}
