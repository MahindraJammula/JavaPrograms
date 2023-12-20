package com.kn.Queue;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n = sc.nextInt();
		Queue q = new Queue(n);
		while (true) {
			System.out.println("Press1--------->INSERT");
			System.out.println("Press2--------->DELETE");
			System.out.println("Press3--------->DISPLAY");
			System.out.println("Any Number To--------->STOP");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				q.insert();
				break;
			case 2:
				q.delete();
				break;
			case 3:
				q.display();
				break;
			default:
				System.exit(0);

			}
		}
	}

}
