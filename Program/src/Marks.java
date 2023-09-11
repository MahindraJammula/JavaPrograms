import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int i=sc.nextInt();
		if (i>=90 && i<=100) {
			System.out.println("A Grade");
		}
		else if(i>=75 && i<90) {
			System.out.println("B Grade");
		}
		else if(i>=50 && i<75) {
			System.out.println("C Grade");
		}
		else if(i>=35 && i<50) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("one more attempt");
		}

	}

}
