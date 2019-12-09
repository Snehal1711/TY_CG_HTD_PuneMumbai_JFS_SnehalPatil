package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Pedgree");
	}

	@Override
	public void sound() {
		System.out.println("Barks");
	}

	@Override
	public void walk() {
		System.out.println("Dog is running...");
	}
	
}
