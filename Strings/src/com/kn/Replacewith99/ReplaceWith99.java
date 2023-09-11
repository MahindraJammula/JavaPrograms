package com.kn.Replacewith99;

import java.util.Scanner;

public class ReplaceWith99 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String = ");
		String s1=sc.nextLine();
		s1=s1.replace("", "99");
		System.out.println(s1);
	}
}
