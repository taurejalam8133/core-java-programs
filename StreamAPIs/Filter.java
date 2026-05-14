package com.nit.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

// wap to filter out & 

public class Filter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> numberDB = List.of(10,20,-34,-45,65);
		Stream<Integer> str=numberDB.stream();
	  //str.filter(n->n%2==0);
		str.filter(n->n%2==0).forEach(System.out::println);
		
		
		
		List<String> str1=List.of("tab","name", "ranj", "ala");
		Stream<String> s=str1.stream();
		s.filter(n->n.charAt(0)=='n').forEach(System.out::println);
		
		
//		if()
//		
//		System.out.println("Enter the size: ");
//		
//		int n=sc.nextInt();
//		
//		for(int i=0; i<n; i++) {
//			int num=sc.nextInt();
//			if(num%2==0) {
//				list.add(num);
//			}
//		}
//		
//		Collections.sort(list);
	//	System.out.println(list);
		
		
		
		
	}

}
