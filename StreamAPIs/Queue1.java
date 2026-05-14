package com.nit.StreamAPI;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue();
		
		queue.add(10);
		queue.add(10);
		queue.add(10);
		queue.add(10);
		queue.add(10);
		
		System.out.println(queue.peek());
		}

}
