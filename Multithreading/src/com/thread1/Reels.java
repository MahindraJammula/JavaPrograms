package com.thread1;

public class Reels extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Created Reels");
			Thread.sleep(2000);
			System.out.println("Upload Reels");
			Thread.sleep(2000);
			System.out.println("Reels ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
