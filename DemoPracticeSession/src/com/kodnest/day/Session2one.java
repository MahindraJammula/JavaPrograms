package com.kodnest.day;

public class Session2one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20,m=0;
		byte b = (byte) a;// type casting
		a = a + b;
		b =(byte) ((b++) + (a * a) + (a / b) + (b % a));
		System.out.println(b);
		long l = b;
		byte b1 =(byte) m;

	}

}
