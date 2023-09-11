import java.util.Scanner;

public class LcmNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number = ");
		int a = sc.nextInt();
		System.out.print("Enter the second numer = ");
		int b = sc.nextInt();
		int gcd=1;
		for (int i=1;i<=a || i<=b;i++) {
			if(a%i==0 && b%i==0) 
				gcd=i;
		}
		int lcm =(a*b) / gcd;
		System.out.println("The given two numbers of LCM = " + lcm);

	}

}
