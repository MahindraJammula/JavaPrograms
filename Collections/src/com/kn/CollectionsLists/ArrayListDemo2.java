package com.kn.CollectionsLists;

import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(100);
		list1.add(100);
		list1.add(true);
		list1.add('a');
		list1.add(10.345);
		list1.add("ten");
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(111);
		list1.add(3, "mahi");
		list1.set(7, true);
		System.out.println(list1);
		System.out.println(list1.size());
	}
}
