
import java.util.Scanner;

public class ArithemticOperation {
	public static void main(String[] args) {
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for given specific Task");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Remainder/Modular devision");
		int n = sc.nextInt();

		if (n == 1) {
			res = ArithTask.addition();
		}
		if (n == 2) {
			res = ArithTask.subtraction();
		}
		if (n == 3) {
			res = ArithTask.multiplication();
		}
		if (n == 4) {
			res = ArithTask.division();
		}
		if (n == 5) {
			res = ArithTask.modulus();
		} else {
			System.out.println("Re-excute and Enter only above numbers");
		}

		System.out.println("Result : " + res);
		sc.close();

	}
}
