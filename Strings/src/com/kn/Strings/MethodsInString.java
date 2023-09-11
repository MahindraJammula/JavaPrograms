package com.kn.Strings;

public class MethodsInString {

	public static void main(String[] args) {
		String s1 = "Raja Ram Mohan Roy";
		System.out.println("______________________________________________");
		System.out.println("Upper Case");
		System.out.println(s1.toUpperCase());
		System.out.println("______________________________________________");		
		System.out.println("Lower Case");
		System.out.println(s1.toLowerCase());
		System.out.println("______________________________________________");		
		System.out.println("Character at given index");
		System.out.println(s1.charAt(2));
		System.out.println("______________________________________________");		
		System.out.println("Index of given Character first time");
		System.out.println(s1.indexOf('a'));
		System.out.println("______________________________________________");		
		System.out.println("Index of given Character last time");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("______________________________________________");		
		System.out.println("Part of given String from given Index");
		System.out.println(s1.substring(5));
		System.out.println("______________________________________________");		
		System.out.println("Part of given String from & till given Index");
		System.out.println(s1.substring(5, 14));
		System.out.println("______________________________________________");		
		System.out.println("Part of given String from given Index");
		System.out.println(s1.contains(" "));

	}

}
