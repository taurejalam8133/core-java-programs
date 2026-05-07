package com.nit.collection;

import java.util.ArrayList;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.name=name;
		this.id=id;
	}
}

public class ArrayListStudentDemo {
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		  list.add(new Student(1, "Ali"));
		  list.add(new Student(2, "Bhajhi"));
		  list.add(new Student(3, "Sagar"));
		  list.add(new Student(4, "Anurag"));
		  
		  for(Student s: list) {
			  System.out.println(s.id+" "+s.name);
		  }

	}

}
