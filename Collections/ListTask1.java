package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int num = sc.nextInt();
        sc.nextLine(); 

        if (num > 10) {
            System.err.println("Error – Maximum 10 tasks allowed");
            return;
        }

        ArrayList<String> tasks = new ArrayList<String>();
    
        for (int i = 0; i < num; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            
            String task = sc.nextLine();
            if(task.length() > 50){
            	System.out.println("Task name too long! Max 50 characters allowed.");
            	
            }
            tasks.add(task);
        }

       System.out.println("\nYour Tasks:");

        Iterator<String> it = tasks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
