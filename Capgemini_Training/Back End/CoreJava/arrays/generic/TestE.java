package com.cabgemini.arrays.generic;

interface Square
{
	int sqr(int a);
}

public class TestE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Square f = a -> a*a ;
         int j = f.sqr(6);
         System.out.println("Square is "+j);
	}

}
