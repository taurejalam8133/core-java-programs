package com.nit.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Worker{
	int id;
	String name;
	
	Worker(int id, String name){
		this.id=id;
		this.name=name;
	}
}

public class ArrayListStudentScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		System.out.println("Enter no. of Student:");
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			
			list.add(new Student(id, name));
		}
		
		System.out.println("Student Details:");
		for(Student s: list) {
			System.out.println(s.id+" "+s.name);
		}
	}

}
