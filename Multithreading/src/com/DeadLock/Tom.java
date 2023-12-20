package com.DeadLock;

public class Tom implements Runnable {
	Hospital h;

	public Tom(Hospital h) {
		this.h = h;
	}

	public void run() {
		h.treatTom();
	}

}
