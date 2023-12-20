package com.kn.Queue;

import java.util.Scanner;

public class Queue {
	private int q[];
	private int size;
	private int r = -1;
	private int f = 0;
	private Scanner sc = new Scanner(System.in);

	public Queue(int n) {
		q = new int[n];
		size = q.length;
	}

	public void insert() {
		int ele;
		if (r == size - 1) {
			System.out.println("Insertion not Possible");
		} else {
			System.out.println("Enter an Element");
			ele = sc.nextInt();
			++r;
			q[r] = ele;
		}
	}

	public void delete() {
		if (r == -1 || f > r) {
			System.out.println("Deletion not Possible");
		} else {
			System.out.println("Enter Deleted is " + q[f]);
			--f;
		}
	}

	public void display() {
		if (r == -1 || f > r) {
			System.out.println("Display not Possible");
		} else {
			for (int i = f; i <= r; i++) {
				System.out.println(q[i] + " ");
			}
		}
		System.out.println();
	}

}
