import java.util.Scanner;

public class NarcissisticNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		long n = sc.nextLong();
		if (power(n) == n) {
			System.out.println(n + " is a Narcissistic Number");
		} else {
			System.out.println(n + " is not a Narcissistic Number");
		}

		sc.close();
	}

	static long power(long n) {
		int power = 0;
		long temp = n;
		while (temp > 0) {
			power++;
			temp = temp / 10;
		}
		long sum = 0;
		long lastDigit = 0;// 123
		long multi = 1;
		while (n > 0) {
			for (int i = 1; i <= power; i++) {
				lastDigit = n % 10;
				multi = multi * lastDigit; //153		
			}
			sum += multi;
			multi = 1;
			n = n / 10;
		}
		return sum;
	}
}
