package com.TightCouple;

public class PaymentAppp {

	public static void main(String[] args) {
		Payment ref;
		ref = new Upi();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		ref = new Card();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		ref = new Wallet();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();

	}

}
