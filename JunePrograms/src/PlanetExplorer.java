import java.util.Scanner;
public class PlanetExplorer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Surface Area -----> A = ");
		double r=sc.nextDouble();
		System.out.print("The radius of the Sphere = ");
		System.out.printf("%.2f",+planet(r));
	}

	static double planet(double r) {
		return (double) 4*Math.PI*(r*r);
	}

}
