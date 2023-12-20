package com.DaemonThread;

public class SavingCode extends Thread {
	@Override
	public void run() {
		for (int i = 1; ; i++) //Infinitelopp
			{
			System.out.println("Save code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
