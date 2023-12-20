package program;
import java.util.Scanner;
public class Simpleif {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Press the key 1 on the keyboard");
	int n = scan.nextInt();
	if (n==1)
	{
		System.out.println("You have pressed 1 on keyboard");
	}
	System.out.println("You have not pressed 1 on keyboard");
	}
}
