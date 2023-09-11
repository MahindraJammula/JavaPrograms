package WhileLoop;

import java.util.Scanner;

public class LengthOfaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int n = sc.nextInt();
		count(n);
	}

	static void count(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		System.out.println("The length of the number " + count);
	}

}
