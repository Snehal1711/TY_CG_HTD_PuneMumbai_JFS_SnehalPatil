package com.capgemini.functioninterface;

import java.util.function.Function;

public class TestA {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i->i*i;
		
		int ans =f.apply(6);
		System.out.println(ans);
	}

}
