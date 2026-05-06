package com.nit.Array;

public class OrderHistory {
	  public static int binarySearch(int[] arr, int key) {
	       int start = 0;
	       int end = arr.length - 1;
	       
	       while (start <= end) {
	    	   
	           int mid = (start + end) / 2;
	           if (arr[mid] == key)
	               return mid;
	           else if (key < arr[mid]) {
	               end = mid - 1;
	           } else {
	               start = mid + 1;
	           }
	       }
	       return -1;
	   }
	  
	  

	   public static void main(String[] args) {
	       int[] nums = { 1, 5, 6, 9, 11, 14, 20 };
	       int index = binarySearch(nums, 13);
	       if (index != -1)
	           System.out.println(index);
	       else
	           System.out.println("Enter a number");

	   }

}
