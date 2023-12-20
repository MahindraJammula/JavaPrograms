package com.TightCouple2;

public class ShapeDemo {

	public static void main(String[] args) {

		// Create object of parent class
		Circle sh;

		// Create object of child class& assign it to parent class
		// Upcasting Circle to shape
		sh = new Circle();

		// Calling methods using child reference
		sh.draw();// Inherited method

		System.out.println("Circle Area = " + sh.calculateArea());

		// Error ===>Child specified methosds can't be called using parent reference
		// System.out.println("Perimeter of circle"+sh.calculatePerimeter());

		// Downcasting to circle to call child specific method
		System.out.println("Perimeter of circle = " + ((Circle) (sh)).calculatePerimeter());
	}

}
