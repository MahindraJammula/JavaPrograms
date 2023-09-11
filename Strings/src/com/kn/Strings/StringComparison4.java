package com.kn.Strings;

public class StringComparison4 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + "Sita";
		String s4 = s1 + "Sita";
		if (s3 == s4) {
			System.out.println("Same Reference");
		} else {
			System.out.println("Different Reference");
		}
		if (s3.equals(s4)) {
			System.out.println("Same String");
		} else {
			System.out.println("Different String");
		}

	}

}
