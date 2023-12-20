package com.DeadLock;

public class Jerry implements Runnable{
	Hospital h;

	public Jerry(Hospital h) {
		this.h = h;
	}


	public void run() {
		h.treatJerry();
	}
}
