package com.AssementsStringPrograms;

import java.util.Scanner;

public class GivenINdexInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		System.out.println("Enter a Index Value = ");
		int index = sc.nextInt();
		char charcter = getCharacterAtIndex(s, index);
		System.out.println("Character at index " + index + ": " + charcter);

	}

	public static char getCharacterAtIndex(String s, int index) {
		if (index >= 0 && index < s.length()) {
			return s.charAt(index);
		} else {
			throw new IndexOutOfBoundsException("Index is out of bounds.");
		}

	}

}
