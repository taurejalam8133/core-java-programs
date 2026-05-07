package com.nit.collection;

import java.util.*;

class Train {
 private int trainNumber;
 private String trainName;
 private String source;
 private String destination;
 private int departureTime;  

 public Train(int trainNumber, String trainName,
              String source, String destination,
              int departureTime) {
     this.trainNumber = trainNumber;
     this.trainName = trainName;
     this.source = source;
     this.destination = destination;
     this.departureTime = departureTime;
 }

 public int getTrainNumber() {
     return trainNumber;
 }

 public String getTrainName() {
     return trainName;
 }

 public String getSource() {
     return source;
 }

 public String getDestination() {
     return destination;
 }

 public int getDepartureTime() {
     return departureTime;
 }
}

public class ConfirmTktTrainScheduleApp {

 public static List<Train> sortTrains(List<Train> trains) {

     Collections.sort(trains, new Comparator<Train>() {

         @Override
         public int compare(Train t1, Train t2) {

             return t1.getDepartureTime() - t2.getDepartureTime();
         }
     });

     return trains;
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     List<Train> trains = new ArrayList<>();

     System.out.print("Enter number of trains: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= n; i++) {

         System.out.println("\nEnter details for Train " + i);

         System.out.print("Enter Train Number: ");
         int number = sc.nextInt();
         sc.nextLine();

         System.out.print("Enter Train Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Source Station: ");
         String source = sc.nextLine();

         System.out.print("Enter Destination Station: ");
         String dest = sc.nextLine();

         System.out.print("Enter Departure Time (HHMM): ");
         int time = sc.nextInt();

         trains.add(new Train(number, name, source, dest, time));
     }

     trains = sortTrains(trains);

     System.out.println("\n====================================");
     System.out.println(" Trains Sorted by Departure Time");
     System.out.println("====================================");

     for (Train t : trains) {
         System.out.println(
             "Train No: " + t.getTrainNumber() +
             ", Name: " + t.getTrainName() +
             ", From: " + t.getSource() +
             ", To: " + t.getDestination() +
             ", Departure Time: " + t.getDepartureTime()
         );
     }

     sc.close();
 }
}

