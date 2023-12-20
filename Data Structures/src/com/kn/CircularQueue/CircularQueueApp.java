package com.kn.CircularQueue;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n = sc.nextInt();
		CircularQueue cq = new CircularQueue(n);
		while (true) {
			System.out.println("Press1--------->INSERT");
			System.out.println("Press2--------->DELETE");
			System.out.println("Press3--------->DISPLAY");
			System.out.println("Any Number To--------->STOP");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				cq.insert();
				break;
			case 2:
				cq.delete();
				break;
			case 3:
				cq.display();
				break;
			default:
				System.exit(0);

			}
		}
	}

}
