package com.cabgemini.arrays.generic;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {1,2,3,4};
		double[] d = {11.2 , 44.5 ,23.5,11.3};
		String[] s = {"Snehal","Anjali","mayuri","Asish"};
		receive(m);
		receive(d);
	}
	
	static void receive(int[] a)
	{
		for(int i : a)
		System.out.println(i);
	}
	
	static void receive(double[] b)
	{
		for(double i : b)
		System.out.println(i);
	}

}
