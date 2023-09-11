import java.util.Scanner;
public class SquareNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=sc.nextInt();
		int sqnum= squarenumber(num);
		System.out.println("Square of given number is "+sqnum);

	}
	static int squarenumber(int num) {
		return num*num;
	}

}

