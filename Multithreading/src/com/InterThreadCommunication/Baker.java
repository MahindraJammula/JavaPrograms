package com.InterThreadCommunication;

public class Baker implements Runnable {
	PizzaHouse p;
	int num = 1;

	public Baker(PizzaHouse p) {
		this.p = p;
	}

	public void run() {
		while (true) {
			p.bake(num++);
		}
	}
}
