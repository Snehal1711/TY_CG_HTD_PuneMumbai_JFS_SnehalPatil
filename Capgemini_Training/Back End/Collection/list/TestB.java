package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(24);
		al.add("Final");
		al.add(6.7);
		al.add('S');
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
			
		}
	}

}
