package com.capgemini.predicate;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {

		Student s=new Student(1,"Snehal",34.8);
		Predicate<Student> p = o ->{
			if(o.percent >=35)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		};
		
		boolean res = p.test(s);
		if(res==true)
		{
			System.out.println("Student is Pass");
		}
		else
		{
			System.out.println("Student is Fail");
		}
	}

}
