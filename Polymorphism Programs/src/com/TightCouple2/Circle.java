package com.TightCouple2;

public class Circle {
	double r = 5.5;

	// override
	public double calculateArea() {
		return Math.PI * r * r;
	}

	// child specific method
	public double calculatePerimeter() {
		return 2 * Math.PI * r;
	}

	public void draw() {
		System.out.println("Drawing circle");
	}
}
