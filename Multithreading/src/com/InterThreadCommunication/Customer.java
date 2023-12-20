package com.InterThreadCommunication;

public class Customer implements Runnable{
	PizzaHouse p;
	int num = 0;

	public Customer(PizzaHouse p) {
		this.p = p;
	}

	public void run() {
		while (true) {
			p.eat();
		}
	}

}
