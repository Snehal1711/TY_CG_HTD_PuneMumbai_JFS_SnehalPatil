package com.capgemini.projectexample;

import java.util.ArrayList;
import java.util.Comparator;


public class TestA {

	public static void main(String[] args) {

		
		Student s1=new Student(1, "Ambika", 24.5,'F');
		Student s2=new Student(2, "Snehal", 87.5 ,'F');
		Student s3=new Student(3, "Anjali", 45.8 ,'F');
		Student s4=new Student(4, "Sneha", 34.8,'F');
		Student s5=new Student(5, "Amol", 67.3 ,'M');
		Student s6=new Student(6, "Alekh", 77.2,'M');
		Student s7=new Student(7, "Manoj", 29.7,'M');
		Student s8=new Student(8, "Siddhesh", 34.0,'M');
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		Helper h = new Helper();
		h.display(al);
		h.displayPassed(al);
		h.displayFailed(al);
		h.getTopper(al);
	}

}
