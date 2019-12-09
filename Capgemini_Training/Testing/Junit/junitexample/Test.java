package com.capgemini.junitexample;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("Snehal",78.9,'F');
		Student s2 = new Student("Anjali",87.9,'F');

		
		School sc = new School();
		
		sc.registerStudent(null);
		Student regStu = sc.registerStudent(s1);
		Student regStu1 = sc.registerStudent(s2);

		
		System.out.println("ID : "+ regStu.getId());
		System.out.println("Name : "+ regStu.getName());
		System.out.println("---------------------------");
		System.out.println("ID : "+ regStu1.getId());
		System.out.println("Name : "+ regStu1.getName());

	}

}
