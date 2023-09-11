package com.kn.PracticeArrays;

import java.util.Scanner;

public class PrimeNumberReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array declaration and creation
		System.out.println("Enter the size of Array = ");
		int[] arr = new int[sc.nextInt()];
		// Array Initialization
		System.out.print("Enter the Elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (isprime(arr[i])) {
				arr[i] = -1;
			}
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(num); i+=2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
