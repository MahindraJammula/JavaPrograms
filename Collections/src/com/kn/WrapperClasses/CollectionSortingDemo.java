package com.kn.WrapperClasses;

import java.util.*;

public class CollectionSortingDemo {

	public static void main(String[] args) {
		// Using Treeset
		TreeSet<Integer> set = new TreeSet<>();
		set.add(40);
		set.add(20);
		set.add(30);
		set.add(8);
		System.out.println("using treeset " + set);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(35);
		list.add(21);
		list.add(65);
		list.add(9);
		System.out.println("before sort " + list);
		Collections.sort(list);
		System.out.println("After sorting " + list);
	}
}
  
