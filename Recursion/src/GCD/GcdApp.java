package GCD;

import java.util.Scanner;

public class GcdApp {
	static public void main(String args[]) {
		// Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1 = ");
		int m = sc.nextInt();
		System.out.println("Enter a number 2 = ");
		int n = sc.nextInt();
		// Create an object
		Gcd demo = new Gcd();
		// call a method
		int res = demo.gcd(m, n);
		// print result
		System.out.println(res);
		// close scanner class
		sc.close();
	}
}
