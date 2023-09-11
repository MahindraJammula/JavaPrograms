package Com.kn.Arrays;

public class SelectionSortDemo {
	public static int[] sort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int min=arr[i];
			int index=i;
			for (int j = i+1; j < arr.length; j++) {// 48 32 16 29 72 44 63
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			//swaping min element
			int temp = 0;
			temp=arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		return arr;
	}
}
