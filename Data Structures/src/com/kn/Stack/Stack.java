package com.kn.Stack;

import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int top = -1;
	private Scanner sc = new Scanner(System.in);

	public Stack(int n) {
		s = new int[n];
		size = s.length;
	}

	public void push() {
		int ele;
		if (top == size - 1) {
			System.out.println("Push not Possible");
		} else {
			System.out.println("Enter an Element");
			ele = sc.nextInt();
			++top;
			s[top] = ele;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Pop not Possible");
		} else {
			System.out.println("Enter Deleted is " + s[top]);
			--top;
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("Display not Possible");
		} else {
			for (int i = 0; i >= 0; i--) {
				System.out.println(s[i] + " ");
			}
		}
	}

}
