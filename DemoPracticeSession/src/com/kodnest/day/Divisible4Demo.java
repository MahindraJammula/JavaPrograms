package com.kodnest.day;

public class Divisible4Demo {
	// Method to find divisible by 4 or not
	public void isDivisiblebyfour(int a) {
		if (a % 4 == 0 && a % 2 == 0) {
			System.out.println("The given number is divisible by 4 and 2");
		} else {
			System.out.println("The given number is not divisible by 4 and 2");
		}
	}
}