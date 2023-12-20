package com.kn.CollectionsSet;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(20);
		set.add(1);
		//set.add(1.5); // Heterogeneous Data not Allowed
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(20); // Duplicates elements not allowed
		set.add(20);

		System.out.println(set);

	}

}
