package com.practice.autowired.spring_autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name of the animal is : " + heart.getNameOfAnimal() + " NO of heart present :"
					+ heart.getNoOfHeart());
		} else {
			System.out.println("Your are dead");
		}
	}

}
