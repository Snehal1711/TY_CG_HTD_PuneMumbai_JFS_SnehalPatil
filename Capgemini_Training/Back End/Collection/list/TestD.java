package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(24);
		al.add("Final");
		al.add(6.7);
		al.add('S');
		
		System.out.println(al); //it will call thw overridden toString method of ArrayList class
	}

}
