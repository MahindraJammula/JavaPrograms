package com.kodnest.practice;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//implicit type casting(low to high)
		System.out.println("Enter an integer value = ");
		int a=sc.nextInt();
		long l=a;
		System.out.println("Implicit casting = "+l);
		//Explicit type casting(high to low)
		System.out.println("Enter a double value = ");
		double d=sc.nextDouble();
		int b=(int)d;
		System.out.println("Explicit casting = "+b);

	}

}
