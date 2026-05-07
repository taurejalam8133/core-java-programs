package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListTask2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of participants: ");
        int num = sc.nextInt();
        sc.nextLine();
        
        if(num > 15) {
        	System.err.println("edjne");
        }
  
        ArrayList<String> tasks = new ArrayList<String>();
        for(int i=0; i<num; i++ ) {
        	System.out.println("Enter the "+(i+1)+" participate: ");
        	   String task = sc.nextLine();
               if(task.length() > 30){
               	System.out.println("Participant names are strings with a maximum of 30 characters.");
               	
               }
               tasks.add(task);
           }
        
        String name=sc.nextLine();
        
        Iterator<String> it = tasks.iterator();
        while (it.hasNext()) {
           String current=it.next();
           boolean found=false;
           if(current.equals(name))
           {
        	   it.remove();
        	   found=true;
           }
           if(!found)
           {
        	   System.out.println(current);
           }
        }
        }
	}    


