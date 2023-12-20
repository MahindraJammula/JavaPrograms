package Oct7Task;

import java.util.Scanner;

public class SumOfRowElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of a= ");
		int a = sc.nextInt();
		System.out.println("Enter a numbers of b= ");
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Row Sums: ");
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Row" + (i + 1) + "Sum:" + sum);
		}

	}

}
