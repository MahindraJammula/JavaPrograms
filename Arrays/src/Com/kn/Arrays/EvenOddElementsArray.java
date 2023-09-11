package Com.kn.Arrays;

public class EvenOddElementsArray {

	public static void main(String[] args) {
		int[] arr = {2,43,26,21,57,24};
		
		evenoroddnumbers(arr);
		

	}

	public static void evenoroddnumbers(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" is even ");
			}else {
				System.out.println(arr[i]+" is odd ");
			}
		}
		
	}

}
