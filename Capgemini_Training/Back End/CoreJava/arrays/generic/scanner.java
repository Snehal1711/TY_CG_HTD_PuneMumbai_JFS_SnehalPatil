package com.cabgemini.arrays.generic;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name =s.nextLine();
		
		System.out.println("Enter your age");
		int age =s.nextInt();
		
		System.out.println("Enter your height");
		double h =s.nextDouble();
		
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
		System.out.println("Height : "+h);
		s.close();// we have to close otherwise we get warning 
		
	}
}
