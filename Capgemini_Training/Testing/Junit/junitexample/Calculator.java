package com.capgemini.junitexample;

public class Calculator {

	public int sum(int a, int b) {
		return a+b;
	}
	
	public int substract(int a, int b) {
		return a-b;
	}
	
	public double mul(double a, int b) {
		return a*b;
	}
	
	public double div(int a, int b) {
		return a/b;
	}
	
	public int factorial(int a) {
		int fact=1;
		for(int i=1 ; i<=a ; i++) {
			fact=fact*i;
		}
		return fact;
	}
}
