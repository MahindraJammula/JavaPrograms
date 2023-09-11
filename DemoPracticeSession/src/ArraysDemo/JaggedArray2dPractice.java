package ArraysDemo;

import java.util.Scanner;

public class JaggedArray2dPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Array Creation and Declaration
		System.out.println("Enter the number of students");
		int[][] arr = new int[sc.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the no of students marks " + (i + 1) + " : ");
			arr[i] = new int[sc.nextInt()];
		}
		//Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Student " + (i + 1) + " data = ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the Student " + (j + 1) + " Marks = ");
				arr[i][j]=sc.nextInt();
			}
		}
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println("Student "+(i+1)+" data = ");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Student "+(j+1)+" data = ");
				System.out.println(arr[i][j]+" ");
			}
		}
	}
}
