package com.kn.Anagram;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take input from user
		System.out.println("Enter a String 1 = ");
		String s1 = sc.nextLine();
		System.out.println("Enter a String 2 = ");
		String s2 = sc.nextLine();
		// Create object of Anagram String class
		AnagramDemo demo = new AnagramDemo();
		// call isAnagram method
		boolean isAnagram = demo.isAnagram(s1, s2);
		// Print output
		if (isAnagram) {
			System.out.println(s1 + " & " + s2 + " is Anagram Strings");
		} else {
			System.out.println(s1 + " & " + s2 + " is not Anagram Strings");
		}
		// close Scanner Class
		sc.close();
	}
}
