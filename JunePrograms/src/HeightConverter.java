import java.util.Scanner;
public class HeightConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the height = ");
		double inch=sc.nextDouble();
		System.out.println("The Height converted into feet = "+Feets(inch));

	}

	static double Feets(double inch) {
		return inch/12;
	}

}
