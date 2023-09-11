
public class Pattern1 {

	public static void main(String[] args) {
		int n=1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j <= i) {
					System.out.print(n);
					n++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
