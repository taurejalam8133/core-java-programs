package com.nit.Array;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int [] arr=new int[5];
		
		System.out.println("Enter 5 numbers : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("you entered : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			
			sc.close();
		}
	}

}
