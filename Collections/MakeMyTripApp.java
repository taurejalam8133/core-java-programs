package com.nit.collection;

import java.util.*;

class Flight {
 private String flightNumber;
 private String source;
 private String destination;
 private double price;
 private int duration;

 public Flight(String flightNumber, String source, String destination,
               double price, int duration) {
     this.flightNumber = flightNumber;
     this.source = source;
     this.destination = destination;
     this.price = price;
     this.duration = duration;
 }

 public String getFlightNumber() {
     return flightNumber;
 }

 public String getSource() {
     return source;
 }

 public String getDestination() {
     return destination;
 }

 public double getPrice() {
     return price;
 }

 public int getDuration() {
     return duration;
 }
}

public class MakeMyTripApp {

 public static List<Flight> sortFlights(List<Flight> flights) {

     Collections.sort(flights, new Comparator<Flight>() {

         @Override
         public int compare(Flight f1, Flight f2) {

             if (f1.getPrice() < f2.getPrice()) {
                 return -1;
             } 
             else if (f1.getPrice() > f2.getPrice()) {
                 return 1;
             }
             else {
                 return f1.getDuration() - f2.getDuration();
             }
         }
     });

     return flights;
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     List<Flight> flights = new ArrayList<>();

     System.out.print("Enter number of flights: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= n; i++) {

         System.out.println("\nEnter details for Flight " + i);

         System.out.print("Enter Flight Number: ");
         String number = sc.nextLine();

         System.out.print("Enter Source City: ");
         String source = sc.nextLine();

         System.out.print("Enter Destination City: ");
         String dest = sc.nextLine();

         System.out.print("Enter Ticket Price: ");
         double price = sc.nextDouble();

         System.out.print("Enter Duration (in minutes): ");
         int duration = sc.nextInt();
         sc.nextLine();

         flights.add(new Flight(number, source, dest, price, duration));
     }

     // Call Sorting Function
     flights = sortFlights(flights);

     // Output
     System.out.println("\n====================================");
     System.out.println(" Flights Sorted by Price & Duration");
     System.out.println("====================================");

     for (Flight f : flights) {
         System.out.println(
             "Flight No: " + f.getFlightNumber() +
             ", From: " + f.getSource() +
             ", To: " + f.getDestination() +
             ", Price: ₹" + f.getPrice() +
             ", Duration: " + f.getDuration() + " minutes"
         );
     }

     sc.close();
 }
}

