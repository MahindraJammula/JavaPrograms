package ForLoop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		fab(num1, num2);

	}

	static void fab(int num1, int num2) {
		int nextnum = 0;
		int num = 10;
		for (int i = 3; i <= num; i++) {
			System.out.println(nextnum + " ");
			nextnum = num1 + num2;
			num1 = num2;
			num2 = nextnum;
		}
	}
}
