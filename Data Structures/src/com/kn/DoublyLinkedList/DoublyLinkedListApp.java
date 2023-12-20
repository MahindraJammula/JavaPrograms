package com.kn.DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dll = new DoublyLinkedList();
		while (true) {
			System.out.println("Press1--------->INSERT REAR");
			System.out.println("Press2--------->DELETE REAR");
			System.out.println("Press3--------->INSERT FRONT");
			System.out.println("Press4--------->DELETE FRONT");
			System.out.println("Press5--------->DISPLAY FROWARD");
			System.out.println("Press6--------->DISPLAY REVERSE");
			System.out.println("Any Number To--------->STOP");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				dll.insertrear();
				break;
			case 2:
				dll.deleterear();
				break;
			case 3:
				dll.insertfront();
				break;
			case 4:
				dll.deletefront();
				break;
			case 5:
				dll.displayforward();
				break;
			case 6:
				dll.displayreverse();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
