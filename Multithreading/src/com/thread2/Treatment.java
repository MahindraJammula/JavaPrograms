package com.thread2;

public class Treatment implements Runnable {
//	Hospital h;

	synchronized public void run() {
		try {
			System.out.println("Treatment Started " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment Progress " + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment Completed " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	public Treatment(Hospital h) {
//		this.h = h;
//	}
}
