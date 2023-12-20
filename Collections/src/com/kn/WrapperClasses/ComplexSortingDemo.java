package com.kn.WrapperClasses;

import java.util.*;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1 = new Student(11, "ABC", 73.5);
		Student s2 = new Student(2, "DEF", 7.5);
		Student s3 = new Student(3, "GHI", 3.5);
		String str = new String("Dummy String");
		System.out.println(str.toString());
		System.out.println(s1);
		System.out.println(s2.toString());
		System.out.println(s3);
		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);

//		 SortStudentById s = new SortStudentById();
//        Collections.sort(studentlist, s);

		// sorting based on id
		Collections.sort(studentlist, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.id > s2.id) {
					return 1;
				} else if (s1.id < s2.id) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		// sorting based on name
		Collections.sort(studentlist, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		
		//sorting based on percentage
//		Collections.sort(studentlist, new Comparator<Student>() {
//			@Override
//			public int compare(Student s1, Student s2) {
//				return s1.getpercentage().compareTos(s2.getpercentage());
//			}
//		});
		System.out.println("==>Before sorting");
		System.out.println(studentlist);
		Collections.sort(studentlist);
		System.out.println("After sorting");
		System.out.println(studentlist);

	}

}
