package com.capgemini.thread;

public class TestB {

	public static void main(String[] args) {

		System.out.println("main started");
		PVR a=new PVR();//on a single object we can run multiple threads
	
		Patym t1 = new Patym(a);
		t1.start();
		
		Patym t2 = new Patym(a);
		t2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.leaveMe();
		System.out.println("main Ended");
	}

}
