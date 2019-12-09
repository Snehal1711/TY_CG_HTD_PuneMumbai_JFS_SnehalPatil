package com.cabgemini.arrays.generic;

interface Gm
{
	void gm();
}

public class TestG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gm g = () -> System.out.println("Good morning");
		g.gm();

	}

}
