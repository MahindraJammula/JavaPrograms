package com.kn.WrapperClasses;

public class Employee implements Comparable {
	@Override
	public int compareTo(Object o) {
		if (this.empid > ((Employee) (o)).empid) {
			return 1;
		} else if (this.empid < ((Employee) (o)).empid) {
			return -1;
		} else {
			return 0;
		}
	}

	int empid;
	String empName;
	double salary;

	public Employee(int empid, String empName, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + empid + ", EmployeeName=" + empName + ", Salary=" + salary + "]";
	}

}
