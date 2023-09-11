package Factorial;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String... args) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		// Create an object
		Factorial demo = new Factorial();
		// Call a Method
		int res = demo.fact(n);
		// Print result
		System.out.println(res);
		// close Scanner class
		sc.close();
	}

}
