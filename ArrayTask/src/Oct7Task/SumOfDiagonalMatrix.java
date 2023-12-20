package Oct7Task;

import java.util.Scanner;

public class SumOfDiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numbers = ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sumOfDiagonals = cSum(arr);
		System.out.println("Sum of Diagonals:" + sumOfDiagonals);
	}

	public static int cSum(int[][] arr) {
		int size = arr.length;
		int mdiagonal = 0;
		int sumSDiagonal = 0;
		for (int i = 0; i < size; i++) {
			mdiagonal += arr[i][i];
			sumSDiagonal += arr[i][size - 1 - i];
		}
		return mdiagonal + sumSDiagonal;
	}

}
