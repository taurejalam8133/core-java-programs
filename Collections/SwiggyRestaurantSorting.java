package com.nit.collection;

import java.util.*;

class Restaurant implements Comparable<Restaurant> {
    int id;
    String name;
    double rating;
    int deliveryTime;

    Restaurant(int id, String name, double rating, int deliveryTime) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public int compareTo(Restaurant other) {

        int ratingCompare = Double.compare(other.rating, this.rating);

        if (ratingCompare != 0) {
            return ratingCompare;
        }

        return Integer.compare(this.deliveryTime, other.deliveryTime);
    }

    void display() {
        System.out.println(
            "Restaurant ID: " + id +
            ", Name: " + name +
            ", Rating: " + rating +
            ", Delivery Time: " + deliveryTime + " minutes"
        );
    }
}

public class SwiggyRestaurantSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Restaurant> restaurants = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("   SWIGGY RESTAURANT SORTING SYSTEM  ");
        System.out.println("====================================");

        System.out.print("Enter number of restaurants: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter details for Restaurant " + i);

            System.out.print("Enter Restaurant ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Restaurant Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Rating (0.0 to 5.0): ");
            double rating = sc.nextDouble();

            System.out.print("Enter Delivery Time (in minutes): ");
            int deliveryTime = sc.nextInt();

            restaurants.add(
                new Restaurant(id, name, rating, deliveryTime)
            );
        }

        Collections.sort(restaurants);

        System.out.println("\n====================================");
        System.out.println(" Restaurants Sorted by Rating & Time ");
        System.out.println("====================================");

        for (Restaurant r : restaurants) {
            r.display();
        }

    }
}