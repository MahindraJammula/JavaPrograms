package com.kodnest.day;

import java.util.Scanner;

public class DemoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int n = sc.nextInt();
		int i=1;
		while(i<=10){
			System.out.println(n +" x "+ i+" = "+n*i);
			i++;
		}
	}
}
