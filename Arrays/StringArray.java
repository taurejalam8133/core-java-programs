package com.nit.Array;

import java.util.Scanner;

public class StringArray{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number of name:");
		int size=sc.nextInt();
		sc.nextLine();
		
		String[] names=new String[size];
		System.out.println("Enter "+size+"names");
		for(int i=0; i<size; i++) {
			names[i]=sc.nextLine();
		}
		
		
		System.out.println("you entered:");
		for(int i=0; i<size; i++) {
			System.out.println(names[i]);
			
			
			sc.close();
		}
	}

}