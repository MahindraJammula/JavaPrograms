package com.kn.StringsPracticePrograms;

import java.util.Scanner;

public class StringIndex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String =");
		String s1 = sc.nextLine();
		System.out.println("Enter a index 1 = ");
		int index1 = s1.charAt(sc.nextInt());
		System.out.println("Enter a index 2 = ");
		int index2 = s1.charAt(sc.nextInt());
		System.out.println("The Character at position = " + (char) index1);
		System.out.println("The Character at position = " + (char) index2);
	}
}
