package com.kn.CollectionsLists;

import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(10);
		ArrayList list2 = new ArrayList();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		System.out.println(list1);
		System.out.println("___________________________________________________________");
		System.out.println(list2);
		System.out.println("___________________________________________________________");
		// list2.addAll(list1);//add all elements of specified collection at the end
		list2.addAll(2, list1);
		// add all elements of specified collection at the specified index
		System.out.println(list2);
		System.out.println("Index of (10) = " + list1.indexOf(10));
		System.out.println("LastIndexof (10) = " + list1.lastIndexOf(10));
	}
}
