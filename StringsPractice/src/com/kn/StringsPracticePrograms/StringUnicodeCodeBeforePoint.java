package com.kn.StringsPracticePrograms;

import java.util.Scanner;

public class StringUnicodeCodeBeforePoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1=sc.nextLine();
		System.out.println("Enter code point INDEX 1 = ");
		int value1=s1.codePointBefore(sc.nextInt());
		System.out.println("Enter code point INDEX  2 = ");
		int value2=s1.codePointBefore(sc.nextInt());
		System.out.println("Character (unicode code point) = "+value1);
		System.out.println("Character (unicode code point) = "+value2);
	}
}
