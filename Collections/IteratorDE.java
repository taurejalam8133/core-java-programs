package com.nit.collection;
import java.util.*;

public class IteratorDE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> list=new ArrayList<>();
		for(int i=0; i<n; i++) {
			String s=sc.nextLine();
			list.add(s);
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String p=itr.next();
			
			System.out.println(p);
			
		}
		sc.close();
	}

}
