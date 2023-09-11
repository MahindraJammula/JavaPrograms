package com.kn.DisplayAllSubStrings;

import java.util.Scanner;

public class DisplayAllSubStrings1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1 = sc.nextLine();
		for (int i = 0; i < s1.length(); i++) {
			String temp = "";
			for (int j = i; j < s1.length(); j++) {
				temp = temp + s1.charAt(j);
				System.out.println(temp);
			}
		}
	}
}
