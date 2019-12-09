package com.capgemini.thread;

public class PVR {
	synchronized void confirm() {
		for(int i = 0 ;i<5 ;i++)
		{
			System.out.println(i);
			try {
				wait();
				Thread.sleep(1000);
				/*System.out.println("notify in for");
				notify();
				main started
				0
				0
				Notify is called
				op:
				main Ended
				notify in for
				1
				notify in for
				1
				notify in for
				2
				notify in for
				2
				notify in for
				3
				notify in for
				3
				notify in for
				4
				notify in for
				4
				notify in for
				notify in for*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void leaveMe()
	{
		System.out.println("Notify is called");
		notify();
	}

}
