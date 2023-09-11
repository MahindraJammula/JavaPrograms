package Com.kn.Arrays;

public class BubbleSortingDemo {
	public int[] bubbleSort(int[] arr) {
		// Bubble sort
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count = 1;
				}
			}
			if (count == 0) {
				break;
			}
		}
		return arr;
	}
}
