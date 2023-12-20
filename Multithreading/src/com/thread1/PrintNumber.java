package com.thread1;

public class PrintNumber extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Number = " + i);
		}
	}
}
