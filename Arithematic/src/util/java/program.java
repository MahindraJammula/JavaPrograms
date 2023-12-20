package util.java;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter 2 numbers");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = a+b;
    System.out.println("Addition result:"+c);
    c=a-b;
    System.out.println("subtraction result:"+c);
    c=a*b;
    System.out.println("multiplication result:"+c);
    c=a/b;
    System.out.println("division result:"+c);
	}
}
