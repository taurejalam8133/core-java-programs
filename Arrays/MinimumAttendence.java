package com.nit.Array;

import java.util.Scanner;

public class MinimumAttendence {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int[] Attendance=new int[7];
		
		System.out.println("Enter all attendance percentage:");
		
		for(int i=0; i<Attendance.length; i++) {
			Attendance[i]=sc.nextInt();
		}
		
		int min=Attendance[0];
		
		for(int Atte:Attendance) {
			if(Atte<min) {
				min=Atte;
			}
		}
		System.out.println("Minimum Attendance :"+min);
		sc.close();
	}

}
