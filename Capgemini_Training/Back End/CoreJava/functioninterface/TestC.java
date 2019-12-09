package com.capgemini.functioninterface;

import java.util.function.Supplier;

import com.capgemini.predicate.Student;

public class TestC {

	public static void main(String[] args) {

		Supplier<Student> a =() -> new Student();
		
		Student s=a.get();
		Student p = a.get();
		
		System.out.println(s);
		System.out.println(p);
	}

}
