import java.util.Scanner;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int n=sc.nextInt();
		knumber(n);
		if(knumber(n)==n) {
			System.out.println(n+" is a krishnamurthy number");
		}else {
			System.out.println(n+" is not a krishnamurthy number");
		}
	}

	static int knumber(int n) {
		int fact=1;
		int temp=n;
		int sum=0;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
			sum+=fact;
			n=n/10;
		}
		return sum;
		
	}

}
