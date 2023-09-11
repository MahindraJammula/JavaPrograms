package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount = ");
		double amount=sc.nextDouble();
		if (amount>100.0) {
			System.out.println("Discount Applicable");
		}else {
			System.out.println("No discount");
		}

	}

}
