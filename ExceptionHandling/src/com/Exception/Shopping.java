package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("Welcom to shopping Application");
		shop();
		System.out.println("***************main() ended****************");
	}

	public static void shop() {
		System.out.println("Shop method started");
		try {
			pay();
		} catch (InputMismatchException e) {
			System.out.println("Shopping has failed due to inappropriate input ");
		}
		System.out.println("Shop() method ended");
	}

	public static void pay() throws InputMismatchException {
		// throws =====> show warning to the method caller
		System.out.println("PAY() method started");
		Scanner sc = null;

		System.out.println("ENter ammount to be paid = ");
		try {
			sc = new Scanner(System.in);
			double amount = sc.nextDouble();
			System.out.println("Amount paid = " + amount);
		} catch (InputMismatchException ime) {
			System.out.println("Exception handling");
			throw ime; // re-throwing exception
		}

		sc.close();
		System.out.println("pay() method ended");
	}

}
