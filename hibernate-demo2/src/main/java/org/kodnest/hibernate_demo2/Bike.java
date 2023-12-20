package org.kodnest.hibernate_demo2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	int regNumber;
	String model;
	double cost;
	@OneToOne
	Students students;

	public Bike() {
		super();
	}

	public Bike(int regNumber, String model, double cost, Students students) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.cost = cost;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", model=" + model + ", cost=" + cost + ", students=" + students + "]";
	}

	

}
