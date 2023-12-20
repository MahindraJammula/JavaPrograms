package com.kn.CollectionsMapFunctions;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		// System.out.println(list);
		int temp = 40;
		// Concurrent Modification with for loop ==>infinite loop
//		for (int i = 0; i < list.size() - 1; i++) {
//			System.out.println(list.get(i));
//			list.add(temp);
//			temp += 10;
//		}

		// Concurrent Modification with for each loop==>ConcurrentModificationException
//		for (Object i : list) {
//			System.out.println(i + " ");
//			list.add(temp += 10);
//		}

		// Concurrent Modification with Iterator==>ConcurrentModificationException
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
			list.add(temp += 10);
		}
	}

}
