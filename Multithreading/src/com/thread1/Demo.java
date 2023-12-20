package com.thread1;

public class Demo {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("===>main()");
		}

		PrintNumber t1 = new PrintNumber();
		t1.start();
		PrintChar t2 = new PrintChar();
		t2.start();
	}

}
