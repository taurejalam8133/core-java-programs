package com.nit.collection;
import java.util.*;

public class FindElementINArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter keys: ");
		
		int n=sc.nextInt();
		sc.nextLine();
		
		ArrayList<Integer> list= new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		int key = sc.nextInt();
		if(list.contains(key)) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

}
