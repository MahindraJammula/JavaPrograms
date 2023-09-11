import java.util.Scanner;
public class Operators1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 Numbers =");
	int num1 =sc.nextInt();
	int num2 =sc.nextInt();
	int result1 = OperatorsApp1.SubtractionNumbers(num1, num2);
	int result2 = OperatorsApp1.MultiplicationNumbers(num1, num2);
	double result3 = OperatorsApp1.DivisionNumbers(num1, num2);
	int result4 = OperatorsApp1.RemainderNumbers(num1, num2);
	
	System.out.println("Difference of 2 numbers ("+num1+" - "+num2+") ="+result1);
	System.out.println("Product of 2 numbers ("+num1+" * "+num2+") ="+result2);
	System.out.println("Division of 2 numbers ("+num1+" / "+num2+") ="+result3);
	System.out.println("Remainder of 2 numbers ("+num1+" % "+num2+") ="+result4);
	sc.close();
	}

}
