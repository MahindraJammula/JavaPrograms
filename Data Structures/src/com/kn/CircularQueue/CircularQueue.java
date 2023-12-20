package com.kn.CircularQueue;

import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int size;
	private int r = -1;
	private int f = 0;
	private int count = 0;
	private Scanner sc = new Scanner(System.in);

	public CircularQueue(int n) {
		cq = new int[n];
		size = cq.length;
	}

	public void insert() {
		int ele;
		if (count == size) {
			System.out.println("Insertion not Possible");
		} else {
			System.out.println("Enter an Element");
			ele = sc.nextInt();
			r = (r + 1) % size;
			cq[r] = ele;
			count++;
		}
	}

	public void delete() {
		if (count == 0) {
			System.out.println("Deletion not Possible");
		} else {
			System.out.println("Enter Deleted is " + cq[f]);
			f = (f + 1) % size;
			count--;
		}
	}

	public void display() {
		int f1 = f;
		if (count == 0) {
			System.out.println("Display not Possible");
		} else {
			for (int i = 1; i <= count; i++) {
				System.out.println(cq[f1] + " ");
				f = (f + 1) % size;
			}
			System.out.println();
		}
	}

}
