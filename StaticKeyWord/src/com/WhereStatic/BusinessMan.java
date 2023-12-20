package com.WhereStatic;

import java.util.Scanner;

public class BusinessMan {
	String name;
	int p;
	int t;
	static float r = 2.0f;
	float si;

	public void takeinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter P for BusinessMan " + name);
		p = sc.nextInt();
		System.out.println("Enter T for BusinessMan " + name);
		t = sc.nextInt();
	}

	public BusinessMan(String name) {
		this.name = name;
	}

	public void calculate() {
		si = (p * t * r) / 100;
	}

	public void display() {
		System.out.println("SI for " + name + " is : " + si);
	}
}
