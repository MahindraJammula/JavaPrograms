package com.OOPS;

public class Employee {
	private int id;
	private String name;
	private double salary;
	static int idgenerator = 1000;

	public Employee(String name, double salary) {
		super();
		this.id = ++idgenerator;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}
