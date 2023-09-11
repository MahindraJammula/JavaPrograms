package com.kodnest.day;

import java.util.Scanner;

public class ElseIfLadderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		if (n == 20) {
			System.out.println("You will get  panipuri or Icecream");
		} else if (n == 40) {
			System.out.println("You will get DoubleScoop Icecream");
		} else if (n == 60) {
			System.out.println("You will get Shawrma");
		} else if (n == 80) {
			System.out.println("You will get boneless chicken");
		}
	}

}
