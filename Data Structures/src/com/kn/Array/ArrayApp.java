package com.kn.Array;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n = sc.nextInt();
		Array a = new Array(n);
		while (true) {
			System.out.println("Press1--------->INSERT");
			System.out.println("Press2--------->DELETE");
			System.out.println("Press3--------->DISPLAY");
			System.out.println("Any Number To--------->STOP");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				a.insert();
				break;
			case 2:
				a.delete();
				break;
			case 3:
				a.display();
				break;
			default:
				System.exit(0);

			}
		}
	}
}
