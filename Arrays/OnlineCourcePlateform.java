package com.nit.Array;

import java.util.Scanner;
import java.util.Arrays;

public class OnlineCourcePlateform {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
       int[] arr=new int[7];
		
		System.out.println("Enter the no. of Student");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int p:arr) {
			if(p>max) {
				
			}
		}
		System.out.println("Maximum attendence:"+max);
		
		
	}

}
