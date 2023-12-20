package com.PropagatinandcustomandduckingException;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Bank Application Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdral = ");
		double withdrawlamount=sc.nextDouble();
		try {
			withdraw(withdrawlamount);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void withdraw(double withdrawlamount) throws Exception{
		double amountbalance=15000.0;
		System.out.println("Withdrawl process Started");
		if(withdrawlamount<=amountbalance) {
			System.out.println(withdrawlamount+"has detected from account");
		}else {
			System.out.println("Insufficient funds");
			throw new InsuffientFundsException();
		}
	}

}
