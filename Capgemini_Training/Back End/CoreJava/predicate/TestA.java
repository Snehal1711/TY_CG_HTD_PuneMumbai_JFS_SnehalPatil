package com.capgemini.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {

		Predicate<Integer> p =i -> {
			if(i%2 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		boolean res =p.test(21);
		System.out.println(res);
	}

}
