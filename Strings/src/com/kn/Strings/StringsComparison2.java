package com.kn.Strings;

public class StringsComparison2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Sita");
		String s2 = new String("Sita");

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
