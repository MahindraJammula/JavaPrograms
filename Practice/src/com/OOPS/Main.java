package com.OOPS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManager em = new EmployeeManager(5);
		boolean b = true;
		while (b) {
			System.out.println("Enter the input : ");
			int in = sc.nextInt();
			if (in == 1) {
				System.out.println("Enter the Employee name ");
				String name = sc.next();
				System.out.println("Enter the Employee Salary ");
				double sal = sc.nextDouble();
				em.addEmployee(name, sal);
			} else if (in == 2) {
				System.out.println("Enter the Employee ID :");
				int eid = sc.nextInt();
				em.displayEmployee(eid);
			} else if (in == 3) {
				em.allEmployeeDetails();
			} else {
				b = false;
				//System.out.println("Invalid Input");
			}
		}
	}

}
