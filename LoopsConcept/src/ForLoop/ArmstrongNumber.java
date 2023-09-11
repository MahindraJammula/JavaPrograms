package ForLoop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number1 = ");
		int n1 = sc.nextInt();
		System.out.print("Enter a number2 = ");
		int n2 = sc.nextInt();
		cubenumber(n1, n2);

	}

	static void cubenumber(int n1, int n2) {
		for (int i = n1; i <= n2; i++) {
			int sum = 0;
			int lastdigit;
			int n;
			n = i;
			while (n != 0) {
				lastdigit = n % 10;
				sum = sum + (lastdigit * lastdigit * lastdigit);
				n = n / 10;
			}
			if (sum == i) {
				System.out.println("" + i + " is an Armstrong number");
			}
		}
	}
}