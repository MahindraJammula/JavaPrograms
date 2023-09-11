package com.kn.Switchcase;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month number (1-12) = ");
		int month=sc.nextInt();
		sc.close();
		int days =0;
		
		switch(month) {
		case 1: //jan
		case 3: //mar
		case 5: //may
		case 7: //july
		case 8: //aug
		case 10://oct
		case 12://dec
			days =31;
			break;
			
		case 4: // april
		case 6: //june
		case 9: //sep
		case 11: //nov
			days =30;
			break;
		case 2: //feb
			days =28;
			break;
			default:
				System.out.println("Invalid month number");
		}
		System.out.println("Number of days in month" + month +" : " + days);
		 

	}

}
