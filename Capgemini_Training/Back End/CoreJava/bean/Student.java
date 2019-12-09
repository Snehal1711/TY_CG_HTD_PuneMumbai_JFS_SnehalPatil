package com.capgemini.bean;

public class Student {
	private int id;
	private String name;
	private double height;
	
	public Student() {
		
	}
	
	public void setId(int id)
	{
		this.id=id;
	}

	public int getId()
	{
		return id;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}

	public String getname()
	{
		return name;
	}
	
	public void setheight(double height)
	{
		this.height=height;
	}

	public double getheight()
	{
		return height;
	}
}
