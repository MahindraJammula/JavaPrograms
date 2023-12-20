package com.kn.WrapperClasses;

import java.util.*;

public class EmployeeSortingDemo {

	public static void main(String[] args) {
		Employee s4 = new Employee(104, "Kranti", 2750000);
		Employee s1 = new Employee(101, "Mahindra", 750000);
		Employee s2 = new Employee(103, "Srinu", 850000);
		Employee s3 = new Employee(102, "Naveen", 1750000);
		String str = new String("Dummy String");
		System.out.println(str.toString());
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);
		System.out.println(s4);
		ArrayList<Employee> employeelist = new ArrayList<>();
		employeelist.add(s1);
		employeelist.add(s2);
		employeelist.add(s3);
		employeelist.add(s4);

		SortEmployeeById s = new SortEmployeeById();
		Collections.sort(employeelist, s);

		// sorting based on id ascending order
		Collections.sort(employeelist, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				if (s1.empid > s2.empid) {
					return 1;
				} else if (s1.empid < s2.empid) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(employeelist);
		// sorting based on id descending order
		Collections.sort(employeelist, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				if (s1.empid > s2.empid) {
					return -1;
				} else if (s1.empid < s2.empid) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(employeelist);

		// sorting based on name ascending order
		Collections.sort(employeelist, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				return s1.getEmpName().compareTo(s2.getEmpName());
			}
		});
		System.out.println(employeelist);
		// sorting based on name descending order
		Collections.sort(employeelist, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				return s2.getEmpName().compareTo(s1.getEmpName());
			}
		});

		// sorting based on salary ascending order
		Collections.sort(employeelist, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				if (s1.salary > s2.salary) {
					return 1;
				} else if (s1.salary < s2.salary) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		System.out.println(employeelist);
		// sorting based on salary descending order
		Collections.sort(employeelist, new Comparator<Employee>() {
			@Override
			public int compare(Employee s1, Employee s2) {
				if (s1.salary > s2.salary) {
					return -1;
				} else if (s1.salary < s2.salary) {
					return 1;
				} else {
					return 0;
				}
			}
		});

//		System.out.println("==>Before sorting");
//		System.out.println(employeelist);
//		Collections.sort(employeelist);
//		System.out.println("After sorting");
//		System.out.println(employeelist);

	}

}
