import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		int res = reversenumber(num);
		if (res == num) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	static int reversenumber(int num) {
		int reverse = 0;
		int lastDigit;
		while (num > 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}
		return reverse;
	}
}
