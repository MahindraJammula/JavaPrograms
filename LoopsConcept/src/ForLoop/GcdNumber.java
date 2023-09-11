package ForLoop;

import java.util.Scanner;

public class GcdNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a num1 = ");
		int n1=sc.nextInt();
		System.out.print("Enter a num2 = ");
		int n2=sc.nextInt();
		findgcd(n1,n2);

	}

	static void findgcd(int n1, int n2) {
		int hcf =1;
		for (int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0)
			hcf = i;
		}
		System.out.println("The given two numbers of HCF is  " + hcf);
		
	}

}
