package com.nit.Array;

import java.util.Scanner;

public class SumOfArray{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter "+size+" element");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("sum="+sum);
		
		sc.close();
		
	}

}
