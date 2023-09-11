import java.util.Scanner;
public class TimeConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the time in minutes = ");
		double m=sc.nextDouble();
		System.out.println("The minutes is converted into hours = "+Feets(m));
        sc.close();
	}

	static double Feets(double m) {
		return m/60;
	}

}
