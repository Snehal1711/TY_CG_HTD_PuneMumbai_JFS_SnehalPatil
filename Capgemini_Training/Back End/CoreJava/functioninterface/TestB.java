
package com.capgemini.functioninterface;

import java.util.function.Function;
import com.capgemini.predicate.Student;

public class TestB {
	public static void main(String[] args) {
		
		Function<Integer, Student> f = i ->{
		Student s = new Student();
		s.id=i;
		return s;
		};
		
		Student s =f.apply(10);
		System.out.println("Name :"+s.name);
		System.out.println("Id : "+s.id);
	}

	
}
