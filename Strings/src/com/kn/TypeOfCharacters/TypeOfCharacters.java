package com.kn.TypeOfCharacters;

import java.util.Scanner;

public class TypeOfCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take input from user
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		// Create object
		TypeOfCharactersDemo demo = new TypeOfCharactersDemo();
		// Call Method
		demo.countTypeOfCharacters(s1);
		// close Scanner
		sc.close();

	}

}
