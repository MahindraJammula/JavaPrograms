import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the speed of the vehicle =");
		double speed =sc.nextDouble();
		System.out.println("Enter the time in hrs =");
		double time =sc.nextDouble();
		double Distance=calculate(speed,time);
		System.out.println("Distance travell in kms :"+ Distance);
		
	}
   static double calculate(double speed, double time) {
	return speed*time;
}
}
