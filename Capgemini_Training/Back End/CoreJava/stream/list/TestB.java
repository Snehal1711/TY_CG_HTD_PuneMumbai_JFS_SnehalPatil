package com.capgemini.stream.list;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestB {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(6);
 		al.add(3);
		al.add(4);
		
		List<Integer> li =al.stream().filter(i->i%2==0).collect(Collectors.toList());
		for(Integer r :li)
		{
			System.out.println(r);
		}
	} 

}
