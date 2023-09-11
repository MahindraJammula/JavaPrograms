package com.kn.Programs;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String s1 = sc.nextLine();
		uniCode(s1);
	}

	public static void uniCode(String s1) {
		for (int i = 0; i <= s1.length() - 1; i++) {
			int unicode = (int) s1.charAt(i);
			System.out.println(unicode + " ");
		}
	}
}
