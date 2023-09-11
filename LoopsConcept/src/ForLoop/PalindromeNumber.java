package ForLoop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  ");
		int n = sc.nextInt();
		int res = count(n);
		if (res == n) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	static int count(int n) {
		int reverse = 0;
		int lastDigit;
		for(int i= reverse-1;i<=n;i++) {
			lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n = n / 10;
		}
		return reverse;

	}

}
