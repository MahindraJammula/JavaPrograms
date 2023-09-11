package com.kodnest.practice;

import java.util.Scanner;

public class PositiveNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number = sc.nextInt(); // You can change this number to test different values

		if (number > 0) {
			System.out.println("The given number is Positive Number");
		}
		else {
			System.out.println("Given Number is not a positive Number");
		}

	}

}
