package com.nit.collection;

import java.util.*;

class Hotel {
 private int hotelId;
 private String hotelName;
 private double pricePerNight;
 private double rating;

 public Hotel(int hotelId, String hotelName,
              double pricePerNight, double rating) {
     this.hotelId = hotelId;
     this.hotelName = hotelName;
     this.pricePerNight = pricePerNight;
     this.rating = rating;
 }

 public int getHotelId() {
     return hotelId;
 }

 public String getHotelName() {
     return hotelName;
 }

 public double getPricePerNight() {
     return pricePerNight;
 }

 public double getRating() {
     return rating;
 }
}

public class HotelRankingApp{

 public static List<Hotel> sortHotels(List<Hotel> hotels) {

     Collections.sort(hotels, new Comparator<Hotel>() {

         @Override
         public int compare(Hotel h1, Hotel h2) {

             if (h1.getPricePerNight() < h2.getPricePerNight()) {
                 return -1;
             } 
             else if (h1.getPricePerNight() > h2.getPricePerNight()) {
                 return 1;
             }
             else {
                 if (h1.getRating() > h2.getRating()) {
                     return -1;
                 } 
                 else if (h1.getRating() < h2.getRating()) {
                     return 1;
                 }
                 else {
                     return 0;
                 }
             }
         }
     });

     return hotels;
 }

 // Main Method
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     List<Hotel> hotels = new ArrayList<>();

     System.out.print("Enter number of hotels: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= n; i++) {

         System.out.println("\nEnter details for Hotel " + i);

         System.out.print("Enter Hotel ID: ");
         int id = sc.nextInt();
         sc.nextLine();

         System.out.print("Enter Hotel Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Price per Night: ");
         double price = sc.nextDouble();

         System.out.print("Enter Rating (0.0 to 5.0): ");
         double rating = sc.nextDouble();

         hotels.add(new Hotel(id, name, price, rating));
     }

     hotels = sortHotels(hotels);

     System.out.println("\n====================================");
     System.out.println(" Hotels Sorted by Price & Rating");
     System.out.println("====================================");

     for (Hotel h : hotels) {
         System.out.println(
             "Hotel ID: " + h.getHotelId() +
             ", Name: " + h.getHotelName() +
             ", Price/Night: ₹" + h.getPricePerNight() +
             ", Rating: " + h.getRating()
         );
     }

     sc.close();
 }
}

