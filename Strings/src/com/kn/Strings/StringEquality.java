package com.kn.Strings;

public class StringEquality {

	public static void main(String[] args) {
		String s1 = "ram";
		String s2 = "RAM";
		if (s1.equals(s2)) {
			System.out.println("Same String");
		} else {
			System.out.println("Different String");
		}
		System.out.println("*************************");
		System.out.println("Ignoring case Senstivity");
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Same String");
		} else {
			System.out.println("Different String");
		}
		String s3 = "Raja Ram Mohan Roy";
		System.out.println("**************************");
		System.out.println("Upper Case");
		System.out.println(s1.toUpperCase());
		System.out.println("***************************");
		System.out.println("Lower Case");
		System.out.println(s1.toLowerCase());
		System.out.println("*****************************");
		System.out.println("Character at given index");
		System.out.println(s1.charAt(2));
		System.out.println("*****************************");
		System.out.println("Index of given Character first time");
		System.out.println(s1.indexOf('a'));
		System.out.println("*****************************");
		System.out.println("Index of given Character last time");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("*****************************");
		System.out.println("Part of given String from given Index");
		System.out.println(s1.substring(5));
		System.out.println("*****************************");
		System.out.println("Part of given String from & till given Index");
		System.out.println(s1.substring(5, 14));
		System.out.println("*****************************");
		System.out.println("Part of given String from given Index");
		System.out.println(s1.contains("am"));

	}

}
