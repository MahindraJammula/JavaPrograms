package com.InterThreadCommunication;

public class PizzaHouseDemo {

	public static void main(String[] args) {
		PizzaHouse p=new PizzaHouse();
		Baker b=new Baker(p);
		Customer c=new Customer(p);
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(c);
		
		t1.start();
		t2.start();
	}

}
