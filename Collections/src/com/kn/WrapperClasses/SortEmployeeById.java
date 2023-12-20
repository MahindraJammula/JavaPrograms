package com.kn.WrapperClasses;

import java.util.*;

public class SortEmployeeById implements Comparator<Employee> {
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

}
