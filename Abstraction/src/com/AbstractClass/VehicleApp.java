package com.AbstractClass;

public class VehicleApp {

	public static void main(String[] args) {
		ShowRoom sh = new ShowRoom();
		sh.acceptVehicle(new Car());

		System.out.println("___________________________________________");
		sh.acceptVehicle(new Bike());

		System.out.println("___________________________________________");
		sh.acceptVehicle(new Truck());

	}

}
