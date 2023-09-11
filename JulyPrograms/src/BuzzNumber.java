import java.util.Scanner;
public class BuzzNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		checknumber(i);
		
	}

	

	static void checknumber(int number) {
		if(number%10==7 || number%7==0) {
			System.out.println(number+"is a buzz number");
			
		}
		
	}

}
