package com.nit.Array;

import java.util.Scanner;

public class MaximumSalary {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		
		int[] salaries=new int[10];
				
				System.out.println("Enter salaries of 10 employees");
		for(int i=0; i<salaries.length; i++) {
			salaries[i]=sc.nextInt();
		}
		int max=salaries[0];
		for(int sal:salaries) {
			if(sal>max) {
				max=sal;
			}
		}
		System.out.println("Maximum Salary= "+max);
		
		sc.close();
		
	}

}