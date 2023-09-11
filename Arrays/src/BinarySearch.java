import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the elements = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key = ");
		int Element = sc.nextInt();
		binarySearch(arr,Element);

	}

	public static void binarySearch(int[] arr,int Element) {
		// TODO Auto-generated method stub
		int position = -1;
		int low = 0;
		int high = arr.length - 1;
		boolean isElementfound = false;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (Element == arr[mid]) {
				position = mid ;
				isElementfound = true;
				break;
			} else if (Element > arr[mid]) {
				low = mid + 1;
				high = high;
			} else {
				high = mid - 1;
				low = low;
			}

		}
		if (isElementfound == false) {
			System.out.println("Element Not found");
		} else {
			System.out.println("Element is found at " + position);
		}

	}

}
