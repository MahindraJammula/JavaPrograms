package Com.ArrayTasks;

import java.util.Scanner;

public class SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of Array = ");
		
		//Array Declaration and Creation
		int[] arr=new int[sc.nextInt()];
		
		//Array Initilization
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter the Elements "+(i+1)+ " = ");
			arr[i] = sc.nextInt();
		}
		
		 sumofElements(arr);
		System.out.println("Sum of Array Elements = "+sumofElements(arr));

	}
	//Method to calculate sum of elements
	public static int sumofElements(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
