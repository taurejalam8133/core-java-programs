package com.nit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4);
		
		Stream<Integer> str=list.stream();
		str.map(n-> n * n).forEach(System.out::println);
	
		
		
		
//		list.stream()
//		.map(n-> n * n).forEach(System.out::println);
	}

}
