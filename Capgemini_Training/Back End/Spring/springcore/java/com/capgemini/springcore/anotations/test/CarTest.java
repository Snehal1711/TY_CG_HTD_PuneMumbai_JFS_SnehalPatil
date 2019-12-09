package com.capgemini.springcore.anotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.anotations.beans.Car;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("carConfig.xml");
		Car myCar = context.getBean("myCar", Car.class);
		
		System.out.println("Model Number : " + myCar.getModelNo());
		System.out.println("Model Name   : " + myCar.getModelName());
		System.out.println("CC is        : " + myCar.getEngine().getCC());
		System.out.println("Type         : " + myCar.getEngine().getType());
		
	}

}
