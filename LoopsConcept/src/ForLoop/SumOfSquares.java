package ForLoop;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num = ");
		int n = sc.nextInt();
		squarenum(n);
		System.out.println(squarenum(n));
	}

	static int squarenum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (i * i);
		}
		return sum;
	}
}
