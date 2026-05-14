package com.nit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
      public static void main(String[] args) {
    	  List<Integer> list=Arrays.asList(10,20,30,40);
    	  
    	  Stream<Integer> str=list.stream();
    	  str.forEach(System.out::println);
      }

}
