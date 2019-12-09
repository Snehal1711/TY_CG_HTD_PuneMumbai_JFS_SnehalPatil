package com.capgemini.springcore.anotations.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Bamboo");
	}

	@Override
	public void sound() {
		System.out.println("Panda Squeaks");
	}

	@Override
	public void walk() {
		System.out.println("Panda is Walking..");
	}

}//end of panda
