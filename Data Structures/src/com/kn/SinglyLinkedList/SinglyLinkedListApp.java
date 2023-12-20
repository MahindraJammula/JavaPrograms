package com.kn.SinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedListApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList ll = new SinglyLinkedList();
		while (true) {
			System.out.println("Press1--------->INSERT REAR");
			System.out.println("Press2--------->DELETE REAR");
			System.out.println("Press3--------->INSERT FRONT");
			System.out.println("Press4--------->DELETE FRONT");
			System.out.println("Press5--------->DISPLAY");
			System.out.println("Any Number To--------->STOP");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ll.insertrear();
				break;
			case 2:
				ll.deleterear();
				break;
			case 3:
				ll.insertfront();
				break;
			case 4:
				ll.deletefront();
				break;
			case 5:
				ll.display();
				break;

			default:
				System.exit(0);
			}
		}
	}

}
