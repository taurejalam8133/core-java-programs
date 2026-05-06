package com.nit.Array;

import java.util.Arrays;

public class RotationArray {
	   public static void main(String args) {
	       int[] a = { 10,20,30,40,50};
	       System.out.println("Before shifting : " + Arrays.toString(a));
	int n = 104; 
	       
	n = n % a.length; 
	while(n!=0) {
	      
	       int temp = a[a.length-1];
	       for (int i = a.length-1; i > 0; i--) {
	           a[i] = a[i -1];
	       }
	
	       a[0] = temp;
	       n--;
	       
	       
	}

	       System.out.println("After shifting : " + Arrays.toString(a));
	   }


}
