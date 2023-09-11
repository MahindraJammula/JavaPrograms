import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Principal value = ");
		double Principal=sc.nextDouble();
		System.out.print("Enter the time period  = ");
		double Time=sc.nextDouble();
		System.out.print("Enter the Rate value = ");
		double Rate=sc.nextDouble();
		System.out.println("The Simple Interest = "+totalvalues(Principal,Time,Rate));

	}

	 static double totalvalues(double principal, double time, double rate) {
		return  (principal*time*12*rate)/100;
	}

}
