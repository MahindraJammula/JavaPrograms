import java.util.Scanner;
public class TechClub {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your marks");
			int marks=sc.nextInt();
			if(marks>=90) {
				System.out.println("welcome student to the techclub");
			}
		}
}
