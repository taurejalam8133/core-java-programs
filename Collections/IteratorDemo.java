package com.nit.collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("C++");
		list.add("C");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
