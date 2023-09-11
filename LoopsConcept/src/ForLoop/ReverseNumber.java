package ForLoop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		reverse(n);
	}

	static void reverse(int n) {
		int r;
		for (int i = 1; i <= n; i++) {
			r = n % 10;
			System.out.print(r);
			n = n / 10;
		}
	}
}
