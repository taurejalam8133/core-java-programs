package com.nit.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
	public static void main(String[] args) {
		List<String> names=List.of("Ali", "John", "David");
		
//		Stream<String> result= names.stream();
//		result.filter(list-> list.startsWith("A")).forEach(System.out::println);
		
		  List<String> result = 
				  names.stream()
		                 .filter(name -> name.startsWith("A"))
		                 .collect(Collectors.toList());

		   System.out.println(result);
		   		   
		
	}

}




