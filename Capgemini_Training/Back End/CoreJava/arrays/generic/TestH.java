package com.cabgemini.arrays.generic;

public class TestH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Mouse m = new Mouse();
		
		double[] d = {11.2 , 4.5 , 6.7 , 5.6};
		m.walk(d);
		
		System.out.println("...................");
		
		int[] i = {1,2,3,4,5};
		m.run(i);
		
		System.out.println("......only odd.............");
		m.onlyOdd(i);
	}

}
