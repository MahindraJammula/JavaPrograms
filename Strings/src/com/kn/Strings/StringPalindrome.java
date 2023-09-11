package com.kn.Strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String s1 = "MADAM";
		String rev = "";
		String temp = s1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println(s1 + " is palindrome");
		} else {
			System.out.println(s1 + " Not a palindrome");
		}
	}
}

