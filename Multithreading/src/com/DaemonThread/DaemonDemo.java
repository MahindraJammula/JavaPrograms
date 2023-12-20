package com.DaemonThread;

public class DaemonDemo {

	public static void main(String[] args) {
		TypingCode t1 = new TypingCode();
		SavingCode t2 = new SavingCode();
		ComplingCode t3 = new ComplingCode();

		t2.setDaemon(true);
		t3.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();
	}
}
