package com.kn.CollectionsMapFunctions;

import java.util.*;

public class AccessingElements {

	public static void main(String[] args) {
		HashMap map1 = new HashMap<>();
		map1.put(1, 11);
		map1.put(2, 11);
		map1.put("Three", new Student(1, "mahi", 7.8));
		map1.put("Four", 11);
		map1.put(5, "5555");
		System.out.println(map1);

		// Accessing keys only using keyset() method which returns a set object
		Set keys = map1.keySet();
		System.out.println("Keys = " + keys);

		// Accessing key-value pair using entryset() method which returns a set object
		Set kv = map1.entrySet();
		System.out.println("Key-Value = " + kv);

		// Accessing only values using values()method which returns a Collection object
		Collection Values = map1.values();
		System.out.println("Values = " + Values);
	}

}
