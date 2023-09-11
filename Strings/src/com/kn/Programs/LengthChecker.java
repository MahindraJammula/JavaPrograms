package com.kn.Programs;

import java.util.Scanner;

public class LengthChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1 = ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String 2 = ");
		String s2 = sc.nextLine();
		if (s1.equals(s2)) {
			System.out.println("Both strings are of same length");
		} else {
			System.out.println("Both strings are of different length");
		}

	}

}
