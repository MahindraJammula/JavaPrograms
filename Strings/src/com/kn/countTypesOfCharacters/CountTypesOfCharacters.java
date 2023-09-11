package com.kn.countTypesOfCharacters;

import java.util.Scanner;

public class CountTypesOfCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1 = scan.nextLine();
		CountTypesOfCharactersDemo count = new CountTypesOfCharactersDemo();
		count.countVowels(s1);
	}
}
