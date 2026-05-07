package com.nit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee2 implements Comparable<Employee2> {
	private String name;
	private String position;
	private int salary;
	
	public Employee2(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +
			   "\nPosition: " + position +
			   "\nSalary: " + salary;
	}
	
	@Override	
	public int compareTo(Employee2 o) {
		return this.getSalary() - o.getSalary();
	}
}

class TestCompare {
	public static void main(String[] args) {
		
		ArrayList<Employee2> employeeDB = new ArrayList<>();
		
		employeeDB.add(new Employee2("james", "Developer", 25000));
		employeeDB.add(new Employee2("Charls", "Tester", 24000));
		employeeDB.add(new Employee2("Alice", "Manager", 36000));
		employeeDB.add(new Employee2("john", "Analyst", 29000));
		
		Iterator<Employee2> itr = employeeDB.iterator();
		
		System.out.println("Before sorting in ascending order based on salary");
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(employeeDB);
		
		System.out.println("***********************************************************");
		
		Iterator<Employee2> sortorder = employeeDB.iterator();
		sortorder.forEachRemaining(System.out::println);
	}
}

