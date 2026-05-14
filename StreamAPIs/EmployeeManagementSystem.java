package com.nit.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

class Employee{
	String name;
	int age;
	double salary;
	String department;
	
	public Employee(String name,int age,double salary,String department) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.department=department;
		
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}
	

}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		
		ArrayList<Employee> employee=new ArrayList<>();
		

            employee.add(new Employee("Arjun", 26, 61000, "IT"));
            employee.add(new Employee("Pooja", 24, 61000, "HR"));
            employee.add(new Employee("Nikhil", 28, 61000, "AI"));
            employee.add(new Employee("Simran", 25, 61000, "QA"));
            employee.add(new Employee("Manish", 30, 61000, "Management"));
            employee.add(new Employee("Kritika", 27, 58000, "IT"));
            employee.add(new Employee("Deepak", 29, 67000, "AI"));
            employee.add(new Employee("Ritika", 23, 39000, "HR"));
            employee.add(new Employee("Harsh", 31, 99000, "Management"));
            employee.add(new Employee("Tanvi", 26, 52000, "QA"));
            employee.add(new Employee("Gaurav", 28, 64000, "IT"));
            employee.add(new Employee("Ishita", 24, 48000, "HR"));
            employee.add(new Employee("Varun", 27, 75000, "AI"));
            employee.add(new Employee("Divya", 25, 53000, "QA"));
            employee.add(new Employee("Sanjay", 32, 105000, "Management"));
            employee.add(new Employee("Ayesha", 26, 56000, "IT"));
            employee.add(new Employee("Rakesh", 29, 72000, "AI"));
            employee.add(new Employee("Shalini", 23, 41000, "HR"));
            employee.add(new Employee("Aditya", 28, 68000, "IT"));
            employee.add(new Employee("Komal", 24, 45000, "QA"));
            employee.add(new Employee("Vikram", 33, 110000, "Management"));
            employee.add(new Employee("Nisha", 27, 59000, "AI"));
            employee.add(new Employee("Mohit", 26, 63000, "IT"));
            employee.add(new Employee("Preeti", 25, 47000, "HR"));
            employee.add(new Employee("Ankit", 30, 87000, "Management"));
		
		
		//employee.stream().filter(obj-> obj.getSalary()<50000).forEach(System.out::println);
		//employee.stream().filter(obj-> obj.getDepartment().equals("IT")).forEach(System.out::println);
            
        //employee.stream().map(Employee::getName).forEach(System.out::println);
		
		
        //int tsal= employee.stream().mapToInt(e-> (int)e.getSalary()).sum();
        // System.out.println(tsal);
            
            
//            OptionalDouble avg= employee.stream().mapToDouble(e-> e.getSalary()).average();
//               System.out.println(avg);
            
//            double avg= employee.stream().mapToDouble(e-> e.getSalary()).average().orElse(0);
//            System.out.println(avg);
            
//            employee.clear();
//            double avg= employee.stream().mapToDouble(e-> e.getSalary()).average().orElse(404);
//            System.out.println(avg);
            
            
//            List<List<String>> skills=List.of(List.of("java","Spring"),List.of("python","django"));
//            skills.stream().flatMap(List::stream).forEach(System.out::println);
            
 //           employee.stream().map(Employee::getSalary).distinct().forEach(System.out::println);
            
            //employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
            
           // employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);
            
           // employee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(10).forEach(System.out::println);
            
          //  employee.stream().sorted(Comparator.comparing(Employee::getSalary)..skip(10).forEach(System.out::println);
            
           // employee.stream().filter(e-> e.getDepartment().equals("HR")).count();
          //  System.out.println( employee.stream().filter(e-> e.getDepartment().equals("HR")).count());
            
            //  System.out.println( employee.stream().anyMatch(null)>);
            
       //  System.out.println( employee.stream().filter(e-> e.getDepartment("management").);
            
            

            

            
            
            
            
            
            
            
            
            

           
            
            
		
		
		
		
	}

}
