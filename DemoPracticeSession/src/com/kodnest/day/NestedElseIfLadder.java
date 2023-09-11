package com.kodnest.day;

import java.util.Scanner;

public class NestedElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age = ");
		int n = sc.nextInt();

		if (n >= 18) {
			System.out.println("Eligible for Adult Movie");
			System.out.println("Enter Yes if you have intervel pass Otherwise Enter NO");
			String s = sc.next();
			if (s == "Yes") {
				System.out.println("You will get intervel snacks pass");
			}
			else {
				System.out.println("You will not get intervel snacks pass");
			}
		}

		else {
			System.out.println("Not Eligible for Adult Movie");
		}

	}

}
