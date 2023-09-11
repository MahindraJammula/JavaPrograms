package com.kn.Largestwordinstring;

import java.util.Scanner;

public class LargestWordInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String 1 = ");
		String s1 = scan.nextLine();
		LargestWordInStringDemo l=new LargestWordInStringDemo();
		l.largestWordInString(s1);
		
	}
}
