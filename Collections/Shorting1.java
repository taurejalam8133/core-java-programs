package com.nit.collection;
import java.util.*;

public class Shorting1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String str=sc.nextLine();
			list.add(str);
		}
		
		Collections.sort(list);
		
		for(String s: list) {
			System.out.println(s);
		}
		
		
	}

}
