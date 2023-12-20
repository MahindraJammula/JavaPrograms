package com.TightCouple2;

public class Rectangle extends Shape {

	public double calculateArea() {
		double l = 5.5, b = 10;
		return l * b;
	}

	double r = 6.7;

	public double calculatePerimeter() {
		return 2 * Math.PI * r;
	}
}
