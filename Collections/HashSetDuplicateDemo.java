package com.nit.collection;

import java.util.HashSet;

public class HashSetDuplicateDemo {
	public static void main(String[] args) {
		
		HashSet<Integer> list =new HashSet<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		
		System.out.println("Element: "+list);
	}

}
