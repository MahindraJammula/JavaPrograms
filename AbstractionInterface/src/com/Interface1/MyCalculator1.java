package com.Interface1;

import java.util.Scanner;

public class MyCalculator1 implements Calculator {
	Scanner sc = new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		System.out.println(c);
	}

	@Override
	public void subtraction() {
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		System.out.println(c);

	}

	@Override
	public void multi() {
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a * b;
		System.out.println(c);

	}

	@Override
	public int div() {
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;

		return c;
	}

}
