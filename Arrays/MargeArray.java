package com.nit.Array;

import java.util.Arrays;

public class MargeArray {
	public static void main(String []args) {
		int[] a= {10,20,30};
		int[] b= {40,50};
		
		
		int[] res=new int[a.length+b.length];
		int index=0;
		for(int x:a) {
			res[index]=x;
			index++;
					
		}
		for(int x:b) {
			res[index]=x;
			index++;
		}
		System.out.println(Arrays.toString(res));
		
		
	}

}
