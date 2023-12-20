package com.Interface1;

public class LaunchCalculator {

	public static void main(String[] args) {
		CasioCalculator cc = new CasioCalculator();
		cc.acceptCalci(new MyCalculator());
		cc.acceptCalci(new MyCalculator1());
		cc.acceptCalci(new MyCalculator2());
	}

}
