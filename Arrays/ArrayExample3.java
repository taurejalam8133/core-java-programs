package com.nit.Array;

import java.util.Scanner;

public class ArrayExample3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		
		
		int[] arr=new int[size];
		
		System.out.println("Enter "+size+ " elements:");
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array element are:");
		for(int p:arr) {
			System.out.println(p);
			
			sc.close();
		}
	
	}

}