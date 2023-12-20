package org.kodnest.spring02;

public class Laptop {
	int serialNumber;
	String manufacturer;
	double cost;

	public Laptop() {
		super();
		System.out.println("no arg constructor");
	}

	public Laptop(int serialNumber, String manufacturer, double cost) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
		System.out.println("parameter constructor");
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
		System.out.println("------>serialnumber");
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		System.out.println("----->manufacture");
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("--->cost");
	}

	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}

}
