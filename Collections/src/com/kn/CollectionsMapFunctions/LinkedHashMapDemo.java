package com.kn.CollectionsMapFunctions;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap map1 = new LinkedHashMap<>();
		map1.put(1, 11);
		map1.put(2, 11);
		map1.put("Three", new Student(1, "mahi", 7.8));
		map1.put("Four", 11);
		map1.put(5, "5555");
		System.out.println(map1);
	}

}
