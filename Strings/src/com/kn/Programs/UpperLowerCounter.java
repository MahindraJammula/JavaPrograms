package com.kn.Programs;

import java.util.Scanner;

public class UpperLowerCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String s1 = sc.nextLine();
		upperLowerCount(s1);
	}

	public static void upperLowerCount(String s1) {
		int lcount = 0;
		int ucount = 0;
		for (int i = 0; i <= s1.length() - 1; i++) {
			int ch = s1.charAt(i);
			if (ch >= 97 && ch <= 122) {
				lcount++;
			} else {
				ucount++;
			}
		}
		System.out.println("Lower case " + lcount);
		System.out.println("Upper case " + ucount);
	}
}
