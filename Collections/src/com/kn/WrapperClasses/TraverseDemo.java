package com.kn.WrapperClasses;

import java.util.*;

public class TraverseDemo {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add("shirt");
		list1.add("Jeans");
		list1.add("Cap");
		list1.add(10);
		list1.add(true);

		// using for loop
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// using for each loop
		for (Object s : list1) {
			System.out.println(s + " ");
		}

		// using while
		Iterator itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

	}

}
