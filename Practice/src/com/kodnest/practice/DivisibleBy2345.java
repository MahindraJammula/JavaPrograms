package com.kodnest.practice;

import java.util.Scanner;

public class DivisibleBy2345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = sc.nextInt();
		isDivisibleby2345(num);

	}

	public static void isDivisibleby2345(int a) {
		// TODO Auto-generated method stub
		if (a % 2 == 0 && a % 3 == 0 && a % 4 == 0 && a % 5 == 0) {
			System.out.println("The given number is divisible by 2,3,4&5");
		} else {
			System.out.println("The given number is not divisible by 2,3,4&5");
		}

	}

}
