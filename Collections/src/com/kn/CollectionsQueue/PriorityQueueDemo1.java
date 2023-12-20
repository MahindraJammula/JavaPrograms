package com.kn.CollectionsQueue;

import java.util.*;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> p1 = new PriorityQueue<String>();
		p1.add("Two");
		p1.add("Twenty");
		p1.add("Thrity");
		//pq.add(10); Generate complie time error due to type safety
		
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		p2.add(10);
		p2.add(20);
		p2.add(30);
		p2.add(5);
		//p2.add("Ten"); Generate complie time error
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
