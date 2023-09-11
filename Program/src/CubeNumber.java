import java.util.Scanner;
public class CubeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=sc.nextInt();
		int cbnum= cubenumber(num);
		System.out.println("Cube of given number is = "+cbnum);

	}
	static int cubenumber(int num) {
		return num*num*num;
  }
}