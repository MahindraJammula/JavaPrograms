package com.AssementsStringPrograms;

import java.util.Scanner;

public class ConvertCaseOfAllAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String res = converCase(str);
		System.out.println(res);
	}

	public static String converCase(String str) {
		char[] crr = str.toCharArray();
		for (int i = 0; i < crr.length; i++) {
			char curr = crr[i];
			if (Character.isUpperCase(curr)) {
				crr[i] = Character.toLowerCase(curr);
			} else if (Character.isLowerCase(curr)) {
				crr[i] = Character.toUpperCase(curr);
			}
		}
		return new String(crr);
	}

}
