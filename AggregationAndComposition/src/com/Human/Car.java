package com.Human;

public class Car {
	String brand;
	String color;
	int cost;

	Engine en = new Engine("Hybrid", 128);

	public Car(String brand, String color, int cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getCost() {
		return cost;
	}

}
