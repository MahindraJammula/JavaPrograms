package com.kn.WrapperClasses;

import java.util.*;

public class TraversingDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> ad = new ArrayList<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(100);

		// using listIterator

		ListIterator<Integer> itr = ad.listIterator(ad.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}
}