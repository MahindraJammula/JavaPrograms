import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("print even number");
		}
		else {
			System.out.println("print odd number");
		}
	}

}
