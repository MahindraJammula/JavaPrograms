package Com.ArrayTasks;

import java.util.Scanner;

public class BackwardTraversingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter the Array Size = ");
		int[] arr = new int[sc.nextInt()];
		//Array Initiliazation
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data for"+(i+1)+" Element = ");
			arr[i]=sc.nextInt();
		}
		int[] crr = backwardTraversing(arr);
		System.out.println("Array Elements Are as Follows :");
		for(int i=crr.length-1;i>=0;i--) {
			System.out.println(crr[i]);
		}
			
		

	}

	public static int[] backwardTraversing(int[] arr) {
		int[] brr=new int[arr.length];
		for(int i=0;i<brr.length;i++) {
			brr[i]=arr[i];
		}
		return brr;
	}

}
