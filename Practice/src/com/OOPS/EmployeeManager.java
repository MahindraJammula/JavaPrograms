package com.OOPS;

public class EmployeeManager {
	private Employee[] e;
	private int size;
	private int capacity;

	public EmployeeManager(int capacity) {
		e = new Employee[capacity];
		this.capacity = capacity;
		size = 0;
	}

	public void addEmployee(String name, double sal) {
		if (size < capacity) {
			e[size] = new Employee(name, sal);
			System.out.println("Employee ID for the given employee :" + e[size].getId());
			size++;
		} else {
			System.out.println("No vacany in the company");
		}
	}

	public void displayEmployee(int eid) {
		for (int i = 0; i < size; i++) {
			if (eid == e[i].getId()) {
				System.out.println("Employee Details");
				System.out.println("Employee ID " + e[i].getId());
				System.out.println("Employee Details : " + e[i].getName());
				System.out.println("Employee Details : " + e[i].getSalary());
			}
		}
	}

	public void allEmployeeDetails() {
		for (int i = 0; i < size; i++) {
			System.out.println("Employee Details");
			System.out.println("Employee ID " + e[i].getId());
			System.out.println("Employee Details : " + e[i].getName());
			System.out.println("Employee Details : " + e[i].getSalary());
			System.out.println("_____________________________________________________________");

		}
	}
}
