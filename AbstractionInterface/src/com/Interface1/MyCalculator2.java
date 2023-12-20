package com.Interface1;

import java.util.Scanner;

public class MyCalculator2 implements Calculator {
	Scanner sc = new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Idiot for this also you need calculator...?");
		}
		int c = a + b;

	}

	@Override
	public void subtraction() {
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Idiot for this also you need calculator...?");
		}
		int c = a - b;

	}

	@Override
	public void multi() {
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 || b == 0) {
			System.out.println("Idiot for this also you need calculator...?");
		}
		int c = a * b;

	}

	@Override
	public int div() {
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if (a == 0) {
			System.out.println("Idiot for this also you need calculator...?");
		} else {
			c = a / b;
		}
		return c;
	}

}
