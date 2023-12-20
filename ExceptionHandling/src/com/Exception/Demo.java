package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		try {

			System.out.println("Connection Established");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers for division ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Division result is " + c);
			System.out.println("Enter Array Length");
			int arr[] = new int[sc.nextInt()];
			System.out.println("Enter the element to insert int array");
			int elem = sc.nextInt();
			System.out.println("Enter the position to insert the element");
			int pos = sc.nextInt();
			arr[pos] = elem;
			System.out.println("Element at position " + pos + " is " + arr[pos]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception........");
		} catch (NegativeArraySizeException e) {
			System.out.println("Negative Array Size Exception....");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayINdexOutOfBoundException.........");
		} catch (InputMismatchException e) {
			System.out.println("Input mis match exception....please give correct input");
		} catch (Exception d) {
			System.out.println("Exception occured please try again");
		} finally {
			// sc.close();
			System.out.println("Connection Termination");
		}

	}
}
