package com.Exception;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator App");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 1st Number = ");
		int a = sc.nextInt();
		System.out.println("Enter a 2nd Number = ");
		int b = sc.nextInt();
		multiply(a, b);
		System.out.println("Thnakyou for using Calculator Application");
		sc.close();
	}

	public static void multiply(int a, int b) {
		System.out.println("multiply() method started");
		int product = a * b;
		System.out.println("Multiplication = " + product);
		divide(a, b);
		System.out.println("Multiply() method ended");
	}

	public static void divide(int a, int b) {
		System.out.println("Divide() method started");
		double quotient = 0;
		try {
			quotient = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exception Handling");
		}

		System.out.println("DIVISION =" + quotient);
		System.out.println("Divide() method ended");
	}
}
