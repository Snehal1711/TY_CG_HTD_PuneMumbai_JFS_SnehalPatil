package com.cabgemini.arrays.generic;

public class TestB {

	public static void main(String[] args) 
	{
		Student[] st = new Student[4];
		Student s1 = new Student(1 ,"snehal",80.36);
		Student s2 = new Student(2 ,"prachi",85.6);
		Student s3 = new Student(3 ,"shweta",67.3);
		Student s4 = new Student(4 ,"alekh",23.36);
		  
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		st[3] = s4;
		 
		receive(st);

	}
	
	static void receive(Student[] k)
	{
		for(Student s :k)
		{
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percent);
			System.out.println("________________");
		}
	}

}
