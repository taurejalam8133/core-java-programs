package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Employee{
    private String name;
    private String position;
    private double salary;
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
    }
   
}
class Directory{
    ArrayList<Employee> emp = new ArrayList<Employee>();
    public void addEmployee(Employee e) {
        emp.add(e);
        System.out.println("Employee added successfully!");
    }
    public void displayAllEmployees() {
        Iterator<Employee> itr = emp.iterator();
        if(emp.isEmpty()) {
        	  System.out.println("No employees found.");
              return;
        }
        
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(i + " -> " + emp.get(i));
        }

    }
  
    public void updateEmployee(int index, Employee newEmp) {
        if (index >= 0 && index < emp.size()) {
            emp.set(index, newEmp);
            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void deleteEmployee(int index) {
        if (index >= 0 && index < emp.size()) {
            emp.remove(index);
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }
}

public class EmployeeManagementSystem {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    Directory directory = new Directory();

    while (true) {
        System.out.println("\n----- Employee Directory Menu -----");
        System.out.println("1. Add Employee");
        System.out.println("2. Display All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter position: ");
                String position = sc.nextLine();
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                directory.addEmployee(new Employee(name, position, salary));
                break;

            case 2:
                directory.displayAllEmployees();
                break;

            case 3:
                System.out.print("Enter index to update: ");
                int upIndex = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new position: ");
                String newPos = sc.nextLine();
                System.out.print("Enter new salary: ");
                double newSal = sc.nextDouble();

                directory.updateEmployee(upIndex, new Employee(newName, newPos, newSal));
                break;

            case 4:
                System.out.print("Enter index to delete: ");
                int delIndex = sc.nextInt();
                directory.deleteEmployee(delIndex);
                break;

            case 5:
                System.out.println("Exiting application. Thank you!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice! Try again.");
        }
    }
}
}

