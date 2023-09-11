package com.kn.StringPrograms;

import java.util.Scanner;

public class StringReverseDemo {
	public static void main(String[] args) {
		// 1. Take the input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String s1 = new String(sc.nextLine());
		// 2.create an object
		StringReverse reverse = new StringReverse();
		// 3.call the method
		String output = reverse.StringReverse(s1);
		// 4.print the output
		System.out.println("To be reversed  " + output);
		// 5.close the scanner
		sc.close();
	}
}
