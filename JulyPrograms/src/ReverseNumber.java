import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int r;
		System.out.print("Reversed Number = ");
		// while(num>0) {
		for (int i = 1; i <= num; i++) {
			r = num % 10;
			System.out.print(r);
			num = num / 10;
		}
	}
}
