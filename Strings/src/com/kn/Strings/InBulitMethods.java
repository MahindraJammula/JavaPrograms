package com.kn.Strings;

public class InBulitMethods {

	public static void main(String[] args) {
		String s1 = "Raja Ram Mohan Roy";
		System.out.println("______________________________________________");
		System.out.println("Returns the length of the String");
		System.out.println(s1.length());
		System.out.println("______________________________________________");
		System.out.println("String Starts with the specified prefix");
		System.out.println(s1.startsWith("Raja"));
		System.out.println("______________________________________________");
		System.out.println("String Starts with the specified suffix");
		System.out.println(s1.endsWith("y"));
		System.out.println("______________________________________________");
		System.out.println(s1.replaceAll("Ra", "Sa"));
		System.out.println("______________________________________________");
		String[] srr=s1.split(" ");
		for(int i=srr.length-1;i>=0;i--) {
			System.out.println(srr[i]+" ");
		}
		System.out.println("______________________________________________");
		
		System.out.println(s1.trim());
		System.out.println("______________________________________________");
		char[] brr=s1.toCharArray();
		System.out.println(brr);
	}

}
