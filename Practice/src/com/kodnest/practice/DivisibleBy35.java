package com.kodnest.practice;

import java.util.Scanner;

public class DivisibleBy35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = sc.nextInt();
		isDivisibleby35(num);
	}

	public static void isDivisibleby35(int a) {
		// TODO Auto-generated method stub
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("The given number is divisible by 3 and 5");
		} else {
			System.out.println("The given number is not divisible by 3 and 5");
		}
	}
}
