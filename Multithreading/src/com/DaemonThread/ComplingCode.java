package com.DaemonThread;

public class ComplingCode extends Thread {
	@Override
	public void run() {
		for (;;) //infinite loop
		{
			System.out.println("Complile code");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
