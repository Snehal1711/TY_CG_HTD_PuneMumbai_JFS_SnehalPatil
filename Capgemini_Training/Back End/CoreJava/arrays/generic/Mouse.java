package com.cabgemini.arrays.generic;

public class Mouse {
	
	void onlyOdd(int []b)
	{
		for(int i : b)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
		}
	}
	
	
	void walk(double[] a)
	{
		for(double i : a)
		{
			System.out.println(i);
		}
	}
	
	void run(int[] b)
	{
		for(int i=0 ; i<b.length ; i++)
		{
			System.out.println(b[i]);
		}
	}
	

}
