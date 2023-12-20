package com.kn.WrapperClasses;

import java.util.*;

public class TransversingDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(70);
		ad.add(100);
		// using decending order()
		Iterator itr = ad.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
