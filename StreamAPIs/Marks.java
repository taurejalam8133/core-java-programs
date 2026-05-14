package com.nit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	int marks;
	
	Student(int m){
		marks=m;
	}

}

public class Marks{
	public static void main(String[] args) {
		List<Student> list=Arrays.asList(new Student(50), new Student(70), new Student(90));
		
		Stream<Student> str=list.stream();
		
		str.filter(s-> s.marks > 60).forEach(s-> System.out.println(s.marks));
		
	}
}
