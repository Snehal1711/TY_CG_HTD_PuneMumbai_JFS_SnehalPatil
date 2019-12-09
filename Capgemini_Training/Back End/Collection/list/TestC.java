package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;
//retrival of elements using ListIterator Interface
public class TestC {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(24);
		al.add("Final");
		al.add(6.7);
		al.add('S');
		
		ListIterator m =al.listIterator();
		System.out.println("upward----------------->");
		while(m.hasNext())
		{
			Object o =m.next();
			System.out.println(o);
		}
		System.out.println("<-----------------Backward");// futher code will retrive the elements by pointing the previous index
		while(m.hasPrevious())
		{
			Object o =m.previous();
			System.out.println(o);
		}
	}

}
