package com.kodnest.day;

import java.util.Scanner;

public class NestedIfProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		if (n >= 18) {
			System.out.println("Eligible for Adult Movie");
			if (n >=18) {
				System.out.println("You will get 3D spects");
			}
		}

		else {
			System.out.println("Not Eligible for Adult Movie");
		}

	}

}
