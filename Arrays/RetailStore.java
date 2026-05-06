package com.nit.Array;

import java.util.Scanner;
import java.util.Arrays;

public class RetailStore {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[7];
		
		System.out.println("Enter the no. of items");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		for(int p:arr) {
			if(p<min) {
				
			}
		}
		System.out.println("Minimum value:"+min);
		
			
	}
}
