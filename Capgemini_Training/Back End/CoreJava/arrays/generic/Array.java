package com.cabgemini.arrays.generic;

public class Array {

	public static void main(String[] args) {
		double[] a = new double[4];
		a[0]=45;
		a[1]= 54;
		a[2]=23;
		a[3]=12;
		
		for(int i = 0 ;i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Integer array");
		
		int[] m = new int[4];
		m[0]= 5 ;
		m[1]= 23;
		m[2]=98;
		m[3]=3456;
		
		for(int i = 0 ;i<m.length ; i++)
		{
			System.out.println(m[i]);
		}
		
		int[] b = {2,56,45,87,56,92,38};
		
		
		for(int i = 0 ;i<b.length ; i++)
		{
			System.out.println(b[i]);
		}

	}

}
