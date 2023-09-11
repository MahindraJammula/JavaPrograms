   package Com.kn.Arrays;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		//Array Declaration
		int[] arr;
		
		//Array Creation
		System.out.print("Enter the size of Elements =");
		arr = new int[sc.nextInt()];
		
		//Array Initilization
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter the Elements "+(i+1)+ " = ");
			arr[i] = sc.nextInt();
			
		}
		
		//Array traversing
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			//sum+=arr[i];
			sum=sum+arr[i];
		}
		System.out.print("The sum of Elements is :"+ sum);
	}
}
