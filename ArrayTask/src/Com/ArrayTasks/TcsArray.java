package Com.ArrayTasks;

import java.util.Scanner;

public class TcsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a distance covered by racers in marathon (kilometers) please = ");
		System.out.println("(press q to terminate)");
		double[] r = new double[sc.nextInt()];
		System.out.println("Enter the size = ");
		for (int i = 0; i <= r.length; i++) {
			r[i] = sc.nextDouble();
		}
		int n = 0;//no of participants 
		if (r[n] >0 && r[n] != 42.195) {
			r[n]=n;
			n++;
		}
	}
}
