package WhileLoop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		findseries(n);

	}

	static void findseries(int n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			// double i=1;
			// while(n>i) {
			sum = sum + 1 / i;
			// i++
		}
		System.out.println("The sum of series is" + sum);
	}

}
