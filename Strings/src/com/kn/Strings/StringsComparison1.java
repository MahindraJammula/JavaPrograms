package com.kn.Strings;

public class StringsComparison1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ram";
		String s2 = "Ram";
		if (s1 == s2) {
			System.out.println("References are same");
		} else {
			System.out.println("Refernces are Different");
		}
		if (s1.equals(s2)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("String are unEqual");
		}
	}
}
