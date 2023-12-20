package com.kn.object;

public class Student {
	int id;
	String name;
	int marks;

	void study() {
		System.out.println("Studying 5 hrs");
	}

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

}
