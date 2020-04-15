package com.practice.dependency_injection_object_type;

public class Student {

	private int id;
	private MathCheat mathcheat;

	public void setId(int id) {
		this.id = id;
	}

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating() {
		mathcheat.mathCheat();
		System.out.println("Hey my id is " + id + "take and do whatever you want to do...");
	}

}
