package com.nit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter2 {
	public static void main(String[] args) {
		List<Integer> list=List.of(10,15,20,25,30);
		
		Stream<Integer> str=list.stream();
		str.filter(n-> n%2==0).forEach(System.out::println);
		
		
//		list.stream()
//		   .filter(n-> n%2==0)
//		   .forEach(System.out::println);
			
		
	}

}
