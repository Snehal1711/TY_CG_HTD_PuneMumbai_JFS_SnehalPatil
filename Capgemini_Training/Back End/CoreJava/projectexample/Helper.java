package com.capgemini.projectexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	

		

	void display(ArrayList<Student> b1)
	{
		Iterator<Student> it=b1.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println("Name : "+s.name);
			System.out.println("Id : "+s.id);
			System.out.println("Percent : "+s.percent);
			System.out.println("Gender : "+s.gender);
			System.out.println("----------------------------");
		}
	}
	
	
	void displayPassed(ArrayList<Student> b1)
	{
		System.err.println("------------Passed Students-----------------------");
		List<Student> li = b1.stream().filter(i->i.percent>=35).collect(Collectors.toList());
		Iterator<Student> it=li.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println("Name : "+s.name);
			System.out.println("Id : "+s.id);
			System.out.println("Percent : "+s.percent);
			System.out.println("Gender : "+s.gender);
			System.out.println("----------------------------");
		}
	}
	
	void displayFailed(ArrayList<Student> b1)
	{
		System.err.println("------------Failed Students-----------------------");
		List<Student> li = b1.stream().filter(i->i.percent<35).collect(Collectors.toList());
		Iterator<Student> it=li.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println("Name : "+s.name);
			System.out.println("Id : "+s.id);
			System.out.println("Percent : "+s.percent);
			System.out.println("Gender : "+s.gender);
			System.out.println("----------------------------");
		}
	}
	
	void displayPassByGender(ArrayList<Student> b1,char g)
	{
		System.err.println("------------Passed Students-----------------------");
		List<Student> li = b1.stream().filter(i->(i.percent>=35 && i.gender==g)).collect(Collectors.toList());
		Iterator<Student> it=li.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println("Name : "+s.name);
			System.out.println("Id : "+s.id);
			System.out.println("Percent : "+s.percent);
			System.out.println("Gender : "+s.gender);
			System.out.println("----------------------------");
		}
	}
	
	void displayFailByGender(ArrayList<Student> b1 ,char g)
	{
		System.err.println("------------Failed Students-----------------------");
		List<Student> li = b1.stream().filter(i->(i.percent<35 && i.gender==g)).collect(Collectors.toList());
		Iterator<Student> it=li.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println("Name : "+s.name);
			System.out.println("Id : "+s.id);
			System.out.println("Percent : "+s.percent);
			System.out.println("Gender : "+s.gender);
			System.out.println("----------------------------");
		}
	}
	
	void getTopper(ArrayList<Student> b1)
	{System.err.println("------------Topper-----------------------");
		Comparator<Student> comp =(e1,e2) ->{
			if(e1.percent>e2.percent)
			{
				return 1;
			}
			else if(e1.percent<e2.percent)
			{
				return -1;
			}
			else
				return 0;
		};
		
		Student topper=b1.stream().max(comp).get();
			System.out.println("Name : "+topper.name);
			System.out.println("Id : "+topper.id);
			System.out.println("Percent : "+topper.percent);
			System.out.println("Gender : "+topper.gender);
			System.out.println("----------------------------");
	}

	

	
}
