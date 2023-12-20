import java.util.Scanner;

public class ArithTask {

	static int addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Addition");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a + b;
	}

	static int subtraction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Subtraction");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a - b;
	}

	static int multiplication() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for multiplication");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a * b;
	}

	static int division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a / b;
	}

	static int modulus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers for Remainder value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a % b;
	}

}
