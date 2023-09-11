
public class PatternTask {

	public static void main(String[] args) {
		int n = 5; // Number of rows in the pattern

		// Loop through each row
		for (int i = 1; i <= n; i++) {
			int num = i;
			int count = n;

			// Print the first set of numbers
			for (int j = 1; j <= n; j++) {
				System.out.print(num + " ");
				num = (num % n) + 1;
			}

			// Print the second set of numbers
			for (int j = 1; j <= n; j++) {
				count--;
				num = (count % n) + 1;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
