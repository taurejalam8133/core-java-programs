package com.nit.collection;
import java.util.*;

public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		int sum=0;
		for(int s:list) {
			if(s%2==0) {
				sum=sum+s;
				
			}	
		}
		System.out.println(sum);
		
	}

}
