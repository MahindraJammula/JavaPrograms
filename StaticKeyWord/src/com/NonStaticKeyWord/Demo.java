package com.NonStaticKeyWord;

public class Demo {
	static int x, y, z;
	int a, b, c;
	static {
		x = 100;
		// Error:- cannot make a static reference to the nonstatic field a
		// a=9;
	}

	static void display() {
		System.out.println(x);
		// Error:-cannot make a static refernce to the non static field a
		// System.out.println(a);
	}
}
