package com.nit.collection;
import java.util.*;

public class DisplayElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> str= new ArrayList<>();
	    	for(int i=0; i<n; i++) {
		    	String s= sc.nextLine();
		    	str.add(s);
			
		}

	    	for(String p : str) {
	    		System.out.println(p);
	    	}
	}

}
