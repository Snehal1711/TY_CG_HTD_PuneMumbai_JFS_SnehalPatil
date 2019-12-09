package com.capgemini.studentapp.qspiders;

import  com.capgemini.studentapp.jspiders.Remote;

public class TestD {
	public static void main(String[] args) {
		
		Remote.off();
		
		System.out.println(Remote.i);
		
		Remote r = new Remote();
		r.on();
		

	}
}
