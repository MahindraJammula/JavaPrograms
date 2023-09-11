import java.util.Scanner;
public class CurrencyConvertor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INR = ");
		int Inr=sc.nextInt();
		System.out.println("$"+dollarconvertor(Inr));
		System.out.println("pounds"+poundconvertor(Inr));
		

	}

	static double poundconvertor(int inr) {
		
		return inr* 0.095;
	}

    static double dollarconvertor(int inr) {

		return inr* 0.012;
	}

}
