import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Factorial Number = ");
		int n= sc.nextInt();
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The number is " + fact);
	}

}
