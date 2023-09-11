package Com.ArrayTasks;

public class EvenorOddElementsDemo {

	// Method to print even or odd numbers
	public void printevenorodd(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even number is : " + arr[i]);
			} else {
				System.out.println("Odd number  is : " + arr[i]);
			}
		}
	}

	// Method to count even or odd numbers
	public void countevenorcountodd(int[] arr) {
		int counteven = 0, countodd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
		}
		System.out.println("Total Even numbers in Array = " + counteven);
		System.out.println("Total Odd numbers in Array = " + countodd);
	}

}
