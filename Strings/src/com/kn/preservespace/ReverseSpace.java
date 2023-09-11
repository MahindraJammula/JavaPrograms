package com.kn.preservespace;

import java.util.Scanner;

public class ReverseSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take input from user
		System.out.println("Enter a String = ");
		String inputstring = sc.nextLine();
		System.out.println("Original String = " + inputstring);
		// create object
		ReverseSpaceDemo demo = new ReverseSpaceDemo();
		// call the method
		String outputstring = demo.reverseSpaceMaintain(inputstring);
		// print result
		System.out.println("Reverse String = " + outputstring);
		// close scanner
		sc.close();
	}
}
