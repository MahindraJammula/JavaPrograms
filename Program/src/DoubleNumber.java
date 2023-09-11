import java.util.Scanner;
public class DoubleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int a =sc.nextInt();
		//int dobnumb =twicenumber(a);
		System.out.println(twicenumber(a)+" - The result of doubling the num");
		System.out.println("=============================================================================");
	}
    static int twicenumber(int a) {
    return a*2;
  }
}  
