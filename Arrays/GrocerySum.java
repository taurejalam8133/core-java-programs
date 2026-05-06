package com.nit.Array;

import java.util.Scanner;

public class GrocerySum {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of grocery items:");
		int size=sc.nextInt();
		
		double[] price=new double[size];
		
		
		System.out.println("Enter "+size+" price");
		for(int i=0; i<size; i++) {
			price[i]=sc.nextDouble();
		}
		double total=0;
		
		for(double p:price) {
			total +=p;
		}
		System.out.println("Total price= "+total);
		sc.close();
	}

}