package com.kn.CollectionsQueue;

import java.util.*;

public class ArrayDequeDemo1 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20.5);
		ad.add("Thirty");
		ad.add(true);

		System.out.println(ad);
		System.out.println("First = " + ad.getFirst());
		System.out.println("First = " + ad.getLast());

		ad.addFirst("First");
		ad.addLast("Last");

		System.out.println("First = " + ad.getFirst());
		System.out.println("First = " + ad.getLast());
		System.out.println(ad);

	}

}
