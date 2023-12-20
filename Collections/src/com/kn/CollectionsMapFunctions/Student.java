package com.kn.CollectionsMapFunctions;

public class Student {

	int id;
	String name;
	double cgpa;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [Id= " + id + ", Name= " + name + ", CGPA= " + cgpa + "]";
	}

}
