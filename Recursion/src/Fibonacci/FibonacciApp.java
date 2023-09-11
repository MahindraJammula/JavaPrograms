package Fibonacci;

import java.util.Scanner;

import Factorial.Factorial;

public class FibonacciApp {

	public static void main(String[] args) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		// Create an object
		Fibonacci demo = new Fibonacci();
		// Call a Method
		int res = demo.fibonacci(n);
		// Print result
		for(int i=0;i<n;i++) {
			System.out.print(res+" ");
		}
		// close Scanner class
		sc.close();
	}

}
