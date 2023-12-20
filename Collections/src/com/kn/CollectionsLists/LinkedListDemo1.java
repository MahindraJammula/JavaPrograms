package com.kn.CollectionsLists;

import java.util.*;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);
		list1.add(2, 22);
		System.out.println(list1);
		list1.set(1, 22);
		list1.add(10);
		System.out.println(list1);
		System.out.println(list1.get(2));
		System.out.println("Index of (10) = " + list1.indexOf(10));
		System.out.println("LastIndexof (10) = " + list1.lastIndexOf(10));
		System.out.println("_______________________________________________________________________");
		LinkedList list2 = new LinkedList();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		list2.add("Five");
		list2.addAll(2, list1);
		System.out.println(list2);
	}
}
