package com.kn.PracticeArrays;

import java.util.Scanner;

public class ArrayReverse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] brr = new int[arr.length];
		int l = brr.length;
		for (int i = 0; i < brr.length; i++) {
			brr[l - 1] = arr[i];
			l--;

		}
		System.out.println("Reverse of another array");
		for (int i = 0; i < brr.length; i++) {
			System.out.println(brr[i]);
		}
	}
}
