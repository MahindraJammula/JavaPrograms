package com.kodnest.day;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a amount(20,40,60,80) = ");
		int n = sc.nextInt();
		switch (n) {
		case 80:
			System.out.println("May be You will get  boneless chicken");
		case 60:
			System.out.println("May be You will get Shawrma");
		case 40:
			System.out.println("May be You will get DoubleScoop Icecream");
		case 20:
			System.out.println("May be You will get panipuri or ice cream");
			break;
		default:
			System.out.println("Enter Required Amount");
		}
	}
}
