package com.nit.Array;

import java.util.Scanner;

public class AverageAge {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
			
			
			int[] ages =new int[8];
			
			System.out.println("Enter ages of 8 employees:");
			
			for(int i=0; i<ages.length; i++) {
				ages[i]=sc.nextInt();
				
			}
			int sum=0;
			
			for(int age:ages) {
				sum +=age;
			}
			double average=(double)  sum/ages.length;
			
			System.out.println("Averages Age="+average);
			
			sc.close();
			
			
		
	}

}
