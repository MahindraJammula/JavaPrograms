package ForLoop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number 1 =");
		int n1=sc.nextInt();
		System.out.print("Enter the number 2 = ");
		int n2=sc.nextInt();
		even(n1,n2);
	}

	 static void even(int n1, int n2) {
		 for (int i=0;i<=n2;i++) {
			 if(i%2==0) {
				 System.out.print(i +" ");
			 }
		 }
		
	}

}
