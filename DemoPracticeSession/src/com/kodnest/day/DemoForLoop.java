package com.kodnest.day;

import java.util.Scanner;

public class DemoForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}

	}

}
