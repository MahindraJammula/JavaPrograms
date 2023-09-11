package ForLoop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n = sc.nextInt();
		for (int i=1;i<=n ;i++) 
		prime(i);
		}
	
	 static void prime(int i) {
		 int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}	
			}
			if (count == 2) {
				System.out.print(i +" ");
		 }
	 }
}

		
		
	


