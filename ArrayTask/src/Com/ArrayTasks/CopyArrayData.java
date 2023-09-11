package Com.ArrayTasks;

import java.util.Scanner;

public class CopyArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Array Declaration and Creation
		System.out.println("Enter the Array Size = ");
		int[] arr = new int[sc.nextInt()];
		//Array Initiliazation
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the data for"+(i+1)+" Element = ");
			arr[i]=sc.nextInt();		
		}
		//Array Traversing
		 int[] crr = copyArrayElements(arr); 
		 System.out.println("Array Elements are as Follows : ");
		 for(int i=0;i<crr.length;i++) {
			 System.out.println(crr[i]);
		 }
	}

	public static int[] copyArrayElements(int[] arr) {
		// TODO Auto-generated method stub
		int brr[] = new int[arr.length];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[i];
		}
		return brr;
	}

}
