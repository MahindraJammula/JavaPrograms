package com.kn.DoublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedList {
	class Node {
		Node prevlink;
		int data;
		Node nextlink;
	}

	private Node first;
	private Scanner sc = new Scanner(System.in);

	public void insertrear() {
		Node temp;
		System.out.println("Enter an Element");
		int ele = sc.nextInt();
		Node newnode = new Node();
		newnode.data = ele;
		newnode.prevlink = null;
		newnode.nextlink = null;
		if (first == null) {
			first = newnode;
		} else {
			temp = first;
			while (temp.nextlink != null) {
				temp = temp.nextlink;
			}
			temp.nextlink = newnode;
			newnode.prevlink = temp;
		}
	}

	public void deleterear() {
		Node temp;
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextlink == null) {
			System.out.println("Element deleted is " + first.data);
			first = null;
		} else {
			temp = first;
			while (temp.nextlink.nextlink != null) {
				temp = temp.nextlink;
			}
			System.out.println("Element deleted is " + temp.nextlink.data);
			temp.nextlink = null;
		}
	}

	public void insertfront() {
		System.out.println("Enter an Element");
		int ele = sc.nextInt();
		Node newnode = new Node();
		newnode.data = ele;
		newnode.prevlink = null;
		newnode.nextlink = null;
		if (first == null) {
			first = null;
		} else {
			newnode.nextlink = first;
			first.prevlink = newnode;
			first = newnode;
		}

	}

	public void deletefront() {
		if (first == null) {
			System.out.println("Deletion not Possible");
		} else if (first.nextlink == null) {
			System.out.println("Element deleted is " + first.data);
			first = null;
		} else {
			first = first.nextlink;
			first.prevlink = null;
		}

	}

	public void displayforward() {
		Node temp;
		if (first == null) {
			System.out.println("Display not Possible");
		} else if (first.nextlink == null) {
			System.out.println(first.data);
		} else {
			temp = first;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.nextlink;
			}
		}
		System.out.println();
	}

	public void displayreverse() {
		Node temp;
		if (first == null) {
			System.out.println("Display not Possible");
		} else if (first.nextlink == null) {
			System.out.println(first.data);
		} else {
			temp = first;
			while (temp.nextlink != null) {
				temp = temp.nextlink;
			}
			while (temp != null) {
				temp = temp.prevlink;
			}
		}
		System.out.println();
	}

}
