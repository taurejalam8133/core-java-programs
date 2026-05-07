package com.nit.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestingList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> strList = new ArrayList<String>();
		strList.add("Taurej");
		strList.add("Alam");
		strList.add(0,"Md");
		strList.remove(0);
		strList.get(1);
	//	strList.add(59);
		
		if(strList.contains("Alam")) {
			System.out.println(strList.indexOf("Alam"));
		}
		else {
			System.out.println("not available");
		}
		
//By using 	for loop 
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
//By using for each loop , we can use any one
//		for(String str : strList) {
//			System.out.println(str);
//		}
		
	}
}