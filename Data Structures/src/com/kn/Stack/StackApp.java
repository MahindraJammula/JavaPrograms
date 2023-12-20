package com.kn.Stack;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stack Size");
		int n = sc.nextInt();
		Stack s = new Stack(n);
		while (true) {
			System.out.println("Press1--------->INSERT");
			System.out.println("Press2--------->DELETE");
			System.out.println("Press3--------->DISPLAY");
			System.out.println("Any Number To--------->STOP");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			default:
				System.exit(0);

			}
		}
	}

}
