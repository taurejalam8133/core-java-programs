package com.nit.Array;

import java.util.Scanner;
import java.util.Arrays;

public class OnlineRegistration {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter registeration size:");
		int size=sc.nextInt();
		
		
		int[] id=new int[size];
		
		System.out.println("Enter "+size+ " Student:");
		for(int i=0; i<size; i++) {
			id[i]=sc.nextInt();
		}
		
		System.out.println("Online registeration student are:");
		for(int p:id) {
			System.out.println(p);
			
			sc.close();
		}
	
	}

}
