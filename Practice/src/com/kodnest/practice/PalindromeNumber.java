package com.kodnest.practice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		int res = isPalindromeornot(n);
		if (res == n) {
			System.out.println("It is a palindrome Number");
		} else {
			System.out.println("It is not a palindrome Number");
		}
	}

	public static int isPalindromeornot(int n) {
		// TODO Auto-generated method stub
		int lastdigit = 0;
		int rev = 0;
		while (n != 0) {
			lastdigit = n % 10;
			rev = rev * 10 + lastdigit;
			n = n / 10;
		}
		return rev;
	}
}
