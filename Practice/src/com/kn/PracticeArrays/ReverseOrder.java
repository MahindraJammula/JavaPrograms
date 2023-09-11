package com.kn.PracticeArrays;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Reverse of array Elements ");
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);//3 2 1
			
		}	
	}
}
