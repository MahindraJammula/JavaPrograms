package com.kodnest.day;

import java.util.Scanner;

public class Divisible4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num = sc.nextInt();
		Divisible4Demo check=new Divisible4Demo();
		check.isDivisiblebyfour(num);
		
		sc.close();
	}
}
