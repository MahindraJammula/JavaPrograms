package com.kn.CeaserCipher;

import java.util.Scanner;

public class CeaserCipher {

	public static void main(String[] args) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String = ");
		String s1 = sc.nextLine();
		System.out.print("Enter a Key = ");
		int k = sc.nextInt();
		// Create Object
		CeaserCipherDemo demo = new CeaserCipherDemo();
		// Call the method
		char[] outputString = demo.ceaseCipher(s1, k);
		// Print Output
		System.out.print(outputString);
		// close the Scanner
		sc.close();
	}
}
