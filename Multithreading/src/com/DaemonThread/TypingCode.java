package com.DaemonThread;

public class TypingCode extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Type code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
