package com.kn.unicode;

import java.util.Scanner;

public class UpperToLowerUnicode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Take input from user
		System.out.println("Enter the String = ");
		String inputstring = sc.nextLine();
		//Create object
		UpperToLowerUnicodeDemo a=new UpperToLowerUnicodeDemo();
		//Call Method
		String outputstring=a.unicode(inputstring);	
		//Print  result
		System.out.print(outputstring);
		//close Scanner
		sc.close();
	}
}
