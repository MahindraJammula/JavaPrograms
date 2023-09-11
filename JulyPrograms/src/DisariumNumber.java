import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		sc.close();
		if (isDisarium(n)) {
			System.out.println(n + " is a disarium number");
		} else {
			System.out.println(n + " is not a disarium number");
		}
	}

	static boolean isDisarium (int n) {
		int di=1;
		int sum=0;
		for(int i=1;i<n;i++) {
		di=di/10;
		sum+=n*di;
		n=n/10;
		
		
		}
		return sum==di;
	}
}
