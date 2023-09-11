import java.util.Scanner;
public class Halve {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number= ");
		double num=sc.nextDouble();
		System.out.println("The result of halving number = "+halving(num));

	}

	static double halving(double num) {
		return num/2;
	}

}
