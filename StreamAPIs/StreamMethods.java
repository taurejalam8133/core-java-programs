package com.nit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4);
			
		Stream<Integer> str=list.stream();
		//str.map(n-> n * n).forEach(System.out::println);
		//str.sorted().forEach(System.out::println);
	    //str.distinct().forEach(System.out::println);
		//str.limit(2).forEach(System.out::println);
			
			
			
//			list.stream()
//			.map(n-> n * n).forEach(System.out::println);
		}

	}


