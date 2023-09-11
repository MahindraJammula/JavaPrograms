package com.kodnest.day;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mahindra");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer = ");
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
		System.out.println("Enter the char value =");
		char g=sc.next().charAt(0);
		System.out.println("Enter the boolean value = ");
		boolean h=sc.nextBoolean();
		System.out.println("a = "+a +", b = "+b +", c = "+c +", d = "+d +", e = "+e +", f = "+f +", g = "+g +", h ="+ h);
		d=b+c;
		System.out.println("d = "+ d);
		a=(int)d;
		System.out.println("a = "+a);
	
		

	}

}
