package com.capgemini.functioninterface;

import java.util.function.Consumer;

import com.capgemini.predicate.Student;

public class TestD {

	public static void main(String[] args) {

		Consumer<Student> c =(s)->{
			System.out.println("Name : "+s.name);
			System.out.println("id : "+s.id);
			
		};
		
		Student s1 =new Student(1,"Snehal",88);
		c.accept(s1);
	}

}
