package com.kn.Strings;

public class StringConcatenation {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram" + "Sita";
		String s4 = "Ram" + "Sita";
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
