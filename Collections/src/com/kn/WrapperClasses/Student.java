package com.kn.WrapperClasses;

public class Student implements Comparable {
	@Override
	public int compareTo(Object o) {
		if (this.id > ((Student) (o)).id) {
			return 1;
		} else if (this.id < ((Student) (o)).id) {
			return -1;
		} else {
			return 0;
		}
	}

	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setId(String name) {
		this.name = name;
	}

	public double getpercentage() {
		return percentage;
	}

	public void setpercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
}
