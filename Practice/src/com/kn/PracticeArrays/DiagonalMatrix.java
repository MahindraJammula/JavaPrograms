package com.kn.PracticeArrays;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array Declaration
		int[][] arr;
		// Array Creation
		System.out.println("Enter the size 1 of Array =");
		int size1 = sc.nextInt();
		System.out.println("Enter the size 2 of Array = ");
		int size2 = sc.nextInt();
		arr = new int[size1][size2];
		// Array Intitialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the elements of " + (i + 1) + " = ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the elements of " + (j + 1) + " = ");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int a;
			for (int j = 0; j < arr.length; j++) {
				if (i + j == 4) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
