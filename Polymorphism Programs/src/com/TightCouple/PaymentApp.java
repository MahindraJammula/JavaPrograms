package com.TightCouple;

public class PaymentApp {

	public static void main(String[] args) {
		Upi upi = new Upi();
		upi.checkBalance();
		upi.sendNotification();
		upi.applyCode();
		upi.pay();
		Card c = new Card();
		c.checkBalance();
		c.sendNotification();
		c.applyCode();
		c.pay();
		Wallet w = new Wallet();
		w.checkBalance();
		w.sendNotification();
		w.applyCode();
		w.pay();
	}

}
