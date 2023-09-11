package com.kn.countcharacters;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1 = sc.nextLine();
		FindCountCharacters demo = new FindCountCharacters();
		demo.findCountCharacters(s1);
	}

}
