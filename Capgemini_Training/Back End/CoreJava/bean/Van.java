package com.capgemini.bean;

public class Van {
	
	private static final Van ref = new Van();
	
	private Van()
	{
		
	}

	public static Van getRef() {
		return ref;
	}

	
}
