package com.kn.Programs;

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1 = ");
		String s1=sc.nextLine();
		System.out.println("Enter the String 2 = ");
		String s2=sc.nextLine();
		if(s1==s2) {
			System.out.println("Same References");
		}else {
			System.out.println("Different References");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are Different");
		}
	}
}
