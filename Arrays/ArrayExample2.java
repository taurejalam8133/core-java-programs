package com.nit.Array;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr =new int[7];
		
		System.out.println("Enter the value");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("you are entered");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			
			sc.close();
		}
	}

}
