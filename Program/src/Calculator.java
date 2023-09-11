import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operation (+,-,*,/)");
		System.out.println("+ ----->Addition");
		System.out.println("- ----->Subtraction");
		System.out.println("* ----->Multiplication");
		System.out.println("/ ----->Division");
		char c= sc.next().charAt(0);
		System.out.println("Enter 2 numbers for ("+c+")");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(c=='+') {
			System.out.println(" Sum of 2 numbers ("+a+" + "+b+") = "+(a+b));
		}
		else if(c=='-') {
			System.out.println(" Difference of 2 numbers ("+a+" - "+b+") = "+(a-b));
		}
		else if(c=='*') {
			System.out.println(" Product of 2 numbers ("+a+" * "+b+") = "+(a*b));
		}
		else if(c=='/') {
			float d=a;
			float e=b;
			System.out.println(" Ratio of 2 numbers ("+d+" / "+e+") = "+(d/e));
		}

	}

}
