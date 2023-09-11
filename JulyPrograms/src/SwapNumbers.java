import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the X and Y values = ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int t;
		System.out.println("Before the swaping numbers: "+x+" "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("After Swaping :"+x+" "+y); 
		System.out.println();
	}

}
