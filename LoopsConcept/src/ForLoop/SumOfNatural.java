package ForLoop;

import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.println("The sum of natural numbers" + sum);
		}
	}
}
