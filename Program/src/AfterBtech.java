import java.util.Scanner;
public class AfterBtech {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks =");
		int i=sc.nextInt();
		if (i>=90 && i<=100) {
			System.out.println("Go for Masters in America");
		}
		else if(i>=75 && i<90) {
			System.out.println("Go for Artificial Intelligence");
		}
		else if(i>=60 && i<75) {
			System.out.println("Go for Neural Networks");
		}
		else if(i>=46 && i<60) {
			System.out.println("Go for Quantum Computing");
		}
		else if(i>0 && i<45)  {
			System.out.println("Go for IT Job");
		}
		else {
			System.out.println("No Job");
		}
		

	}

}
