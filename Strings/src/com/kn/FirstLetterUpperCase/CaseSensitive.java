package com.kn.FirstLetterUpperCase;

import java.util.Scanner;

public class CaseSensitive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Take input from user
		System.out.println("Enter the String = ");
		String inputstring = sc.nextLine();
		//Create object
		 CaseSensitiveDemo a=new CaseSensitiveDemo();
		//Call Method
		String Outputstring=a.upperToLowerCase(inputstring);	
		//Print  result
		System.out.println(Outputstring);
		//close Scanner
		sc.close();
	}
}
