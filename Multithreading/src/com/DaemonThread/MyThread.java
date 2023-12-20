package com.DaemonThread;

public class MyThread extends Thread {
	@Override
	public void run() {
		// condition check based on current Executing Thread name
		if (Thread.currentThread().getName().equalsIgnoreCase("numbers")) {
			printnumbers();
		} else {
			printcharacters();
		}
	}

	// method to cal printing numbers
	public void printnumbers() {
		System.out.println("====> Printing numbers started");
		for (int i = 1; i <= 10; i++) {
			System.out.println("****" + i + " ");
		}
		System.out.println("===> printing numbers completed");
	}
		//method to call printing character                                                     -  
	public void printcharacters() {
		System.out.println("====> Printing characters started");
		for (int i = 65; i <= 74; i++) {
			System.out.println((char) (i) + " ");
		}
		System.out.println("===> printing characters completed");
	}
}
