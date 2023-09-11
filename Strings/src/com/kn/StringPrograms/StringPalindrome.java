package com.kn.StringPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//take input from user
		System.out.println("Enter the String = ");
		String s1=new String(sc.nextLine());
		//create on object
		StringPalindromeDemo rev=new StringPalindromeDemo();
		//call method
		String output= rev.StringPalindromeDemo(s1);
		//print output 
		System.out.println("To be reversed  "+ output);
		//close scanner
		sc.close();
	}

}
