package com.SingleTonDesignPattern;

public class PrimeMinisterApp {

	public static void main(String[] args) {
		PrimeMinister pm1 = PrimeMinister.getInstance();
		PrimeMinister pm2 = PrimeMinister.getInstance();
		System.out.println(pm1);
		System.out.println(pm2);
		//PrimeMinister.pm=null;
	}
}
