package WhileLoop;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while (i<=n) {
			if (i%2!=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("The sum of odd numbers"+" is: "+sum);

	}

}
