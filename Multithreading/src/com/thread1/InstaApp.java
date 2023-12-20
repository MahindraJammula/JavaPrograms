package com.thread1;

public class InstaApp {

	public static void main(String[] args) {
		Chatting c = new Chatting();
		Reels r = new Reels();
		c.start();
		r.start();
		try {
			c.join();
			r.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
