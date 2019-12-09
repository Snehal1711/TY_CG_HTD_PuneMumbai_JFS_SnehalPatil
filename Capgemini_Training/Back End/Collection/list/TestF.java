package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestF {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Rajv");
		al.add(19);
		al.add('M');
		al.add(6.14);
		
		for(Object o : al)
		{
			System.out.println(o);
		}
	}

}
