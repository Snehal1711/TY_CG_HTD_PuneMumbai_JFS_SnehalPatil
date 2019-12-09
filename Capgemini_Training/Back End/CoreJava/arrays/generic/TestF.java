package com.cabgemini.arrays.generic;

interface Area
{
	double areaOfSquare(double r);
}

public class TestF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = r -> 3.142*r*r ;
		double result = a.areaOfSquare(2.1);
		System.out.println("Area of circle is "+result);

	}

}
