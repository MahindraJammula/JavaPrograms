package com.kn.PracticeArrays;

import java.util.Scanner;

public class EvenElementsInOddIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i] % 2 == 0)
				System.out.println("Element at Index " + i + " is " + arr[i]);
		}
	}
}
