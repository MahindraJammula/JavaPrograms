package com.thread1;

public class Chatting extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Chatting started");
			Thread.sleep(2000);
			System.out.println("Chit chat");
			Thread.sleep(2000);
			System.out.println("Chatting ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
