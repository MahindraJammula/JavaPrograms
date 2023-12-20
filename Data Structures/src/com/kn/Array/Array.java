package com.kn.Array;

import java.util.Scanner;

public class Array {
	private int arr[];
	private Scanner sc = new Scanner(System.in);

	public Array(int n) {
		arr = new int[n];
	}

	public void insert() {
		System.out.println("Enter the Position from 0 to " + (arr.length - 1));
		int pos = sc.nextInt();
		System.out.println("Enter the Element");
		int ele = sc.nextInt();
		arr[pos] = ele;
	}

	public void delete() {
		System.out.println("Enter the Position to Delete the Element ");
		int pos = sc.nextInt();
		System.out.println("Element Deleted is " + arr[pos]);
		arr[pos] = 0;
	}

	public void display() {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
}
