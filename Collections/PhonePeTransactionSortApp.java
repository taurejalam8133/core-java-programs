package com.nit.collection;

import java.util.*;

class Transaction {
 private String transactionId;
 private String userName;
 private double amount;
 private String type;

 public Transaction(String transactionId, String userName,
                    double amount, String type) {
     this.transactionId = transactionId;
     this.userName = userName;
     this.amount = amount;
     this.type = type;
 }

 public String getTransactionId() {
     return transactionId;
 }

 public String getUserName() {
     return userName;
 }

 public double getAmount() {
     return amount;
 }

 public String getType() {
     return type;
 }
}

public class PhonePeTransactionSortApp {

 public static List<Transaction> sortTransactions(List<Transaction> transactions) {

     Collections.sort(transactions, new Comparator<Transaction>() {

         @Override
         public int compare(Transaction t1, Transaction t2) {

             if (t1.getAmount() > t2.getAmount()) {
                 return -1;
             } 
             else if (t1.getAmount() < t2.getAmount()) {
                 return 1;
             } 
             else {
                 return 0;
             }
         }
     });

     return transactions;
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     List<Transaction> transactions = new ArrayList<>();

     System.out.print("Enter number of transactions: ");
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= n; i++) {

         System.out.println("\nEnter details for Transaction " + i);

         System.out.print("Enter Transaction ID: ");
         String id = sc.nextLine();

         System.out.print("Enter User Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Transaction Amount: ");
         double amount = sc.nextDouble();
         sc.nextLine();

         System.out.print("Enter Transaction Type (Credit/Debit): ");
         String type = sc.nextLine();

         transactions.add(new Transaction(id, name, amount, type));
     }

     transactions = sortTransactions(transactions);

     System.out.println("\n====================================");
     System.out.println(" Transactions Sorted by Amount");
     System.out.println("====================================");

     for (Transaction t : transactions) {
         System.out.println(
             "Transaction ID: " + t.getTransactionId() +
             ", User: " + t.getUserName() +
             ", Amount: ₹" + t.getAmount() +
             ", Type: " + t.getType()
         );
     }

     sc.close();
 }
}
