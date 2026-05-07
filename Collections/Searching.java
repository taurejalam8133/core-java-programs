package com.nit.collection;
import java.util.*;

public class Searching {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<String> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			String s=sc.nextLine();
			list.add(s);
		}
		int search = sc.nextInt();
		
		if(list.contains(search)) {
			System.out.println("found");
		}
		else {
			System.out.println("Not found");
		}
		
		
	}

}
