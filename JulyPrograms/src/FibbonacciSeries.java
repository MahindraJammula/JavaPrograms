import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 and num2 =");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Fab(num1, num2);

	}

	static void Fab(int num1, int num2) {
		int nextnumber = 0;
		int num = 10;

		for (int i =1; i < num; i++) {

			System.out.print(nextnumber + " ");
			nextnumber = num1 + num2;
			num1 = num2;
			num2 = nextnumber;
		}

	}
}
