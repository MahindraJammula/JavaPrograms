package com.kodnest.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer = ");
		int a=sc.nextInt();
		System.out.println("Enter the byte value = ");
		byte b=sc.nextByte();
		System.out.println("Enter the short value =");
		short c=sc.nextShort();
		System.out.println("Enter the long value = ");
		long d=sc.nextLong();
		System.out.println("Enter the float value = ");
		float e=sc.nextFloat();
		System.out.println("Enter the double value = ");
		double f=sc.nextDouble();
		a=b+c;
		System.out.println("Addition = "+a);
		d=d-a;
		System.out.println("Subtraction = "+d);
		e=e*b;
		System.out.println("Multiplication = "+e);
		f=f/a;
		System.out.println("Division = "+f);
	}
}
