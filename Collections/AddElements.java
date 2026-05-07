package com.nit.collection;
import java.util.*;

public class AddElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of element: ");
		int n=sc.nextInt();
		//sc.nextLine();
		
		ArrayList<Integer>  list=new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		for(int x : list) {
			System.out.print(x + " ");
		}
	}

}
