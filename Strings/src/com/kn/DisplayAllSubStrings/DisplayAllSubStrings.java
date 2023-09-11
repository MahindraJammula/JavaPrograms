package com.kn.DisplayAllSubStrings;

import java.util.Scanner;

public class DisplayAllSubStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1 = sc.nextLine();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j < s1.length(); j++) {
				String s = s1.substring(i, j);
				System.out.println(s + " ");
			}
		}
	}
}
