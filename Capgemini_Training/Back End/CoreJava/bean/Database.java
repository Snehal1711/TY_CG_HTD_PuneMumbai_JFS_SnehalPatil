package com.capgemini.bean;

public class Database {
	
	void receive(Student t)
	{
		System.out.println("Student id : "+t.getId());
		System.out.println("Student name : "+t.getname());
		System.out.println("Student height : "+t.getheight());
	}

	void receive(Employee e)
	{
		System.out.println();
	}
}
