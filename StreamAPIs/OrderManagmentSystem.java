package com.nit.StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.border.Border;


class Order
{
	int id;
	String customerNam;
	String productName;
	String catgory;
	int pric;
	int quntity;
	String address;
	boolean isDelevrd;
	
	
	public Order(int id, String customerNam, String productName, String catgory, int pric, int quntity, String address,
		boolean isDelevrd) {
		//super();
		this.id = id;
		this.customerNam = customerNam;
		this.productName = productName;
		this.catgory = catgory;
		this.pric = pric;
		this.quntity = quntity;
		this.address = address;
		this.isDelevrd = isDelevrd;
	}
	
	
	public int getId() {
		return id;
	}
	public String getCustomerNam() {
		return customerNam;
	}
	public String getProductName() {
		return productName;
	}
	public String getCatgory() {
		return catgory;
	}
	public int getPric() {
		return pric;
	}
	public int getQuntity() {
		return quntity;
	}
	public String getAddress() {
		return address;
	}
	public boolean isDelevrd() {
		return isDelevrd;
	}
	@Override
	public String toString() {
		return "order [id=" + id + ", customerNam=" + customerNam + ", productName=" + productName + ", catgory="
				+ catgory + ", pric=" + pric + ", quntity=" + quntity + ", address=" + address + ", isDelevrd="
				+ isDelevrd + "]";
	}
	
	
}
public class OrderManagmentSystem {
	public static void main(String[] args) {
		Order o1=new Order(101, "Sagar", "electronic", null, 2000, 1, "Ameerpet", false );
		Order o2=new Order(101, "Alam", "Medicine", null, 2000, 1, "Ameerpet", false );
		Order o3=new Order(101, "Aman", "electronic", null, 200, 1, "Ameerpet", false );
		Order o4=new Order(101, "Harbhajan", "Cloth", null, 500, 1, "Ameerpet", false );
		Order o5=new Order(101, "Sahu", "Product", null, 100, 1, "Ameerpet", false );
		
		List<Order> stream= List.of(o1,o2,o3,o4,o5);
		
		Stream<Order> orders=Stream.of(o1,o2,o3,o4,o5);
		
		
		// Find the average value of order
//		double avg=avgValue.collect(Collectors.averagingDouble(Order::getPric)); 
//		 System.out.println("Average Value: "+avg);
		
		
		
//		double avgValue=stream.stream().collect(Collectors.averagingDouble(Order::getPric));
//		 System.out.println("Average Value: "+avgValue);
		
		// find the highestPrice price
//	   Optional<Order> max=avgValue.collect(Collectors.maxBy(Comparator.comparing(Order::getPric)));
//		System.out.println("Max Value: "+max);
		
			System.out.println(orders.collect(Collectors.partitioningBy(Order::isDelevrd)));


		
		
		

	}

}
