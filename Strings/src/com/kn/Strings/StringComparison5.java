package com.kn.Strings;

public class StringComparison5 {

	public static void main(String[] args) {
		String s3 = "Ram";
		String s4 = s3;
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
