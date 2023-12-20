package com.StaticKeyWord;

public class Demo {
	static int x, y, z;
	static {
		x = 100;
		y = 200;
		z = 300;
	}

	static public void display1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	int a, b, c;
	{
		a = 9;
		b = 99;
		c = 999;
		x = 10;
		y = 20;
		z = 30;
	}

	public void display2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
}
