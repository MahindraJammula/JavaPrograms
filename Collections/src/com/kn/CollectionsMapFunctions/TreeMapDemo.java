package com.kn.CollectionsMapFunctions;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map1 = new TreeMap<>();
		map1.put(1, 100);
		map1.put(2, new Student(1,"Akash",8.2));
		//map1.put("Three", 400);
		map1.put("3", 400);
		map1.put(4, 300);
		map1.put(5, 500);
		System.out.println(map1);

	}

}
