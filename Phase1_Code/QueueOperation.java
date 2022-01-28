package com.mahajan;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperation {
	
	public static void main(String[] args) 
	{
	    Queue<String> locationsQueue = new LinkedList<>();
	                locationsQueue.add("Khargone");
	        		locationsQueue.add("Mumbai");
	        		locationsQueue.add("Banaglore");
	        		locationsQueue.add("Pune");
	        		locationsQueue.add("Vizag");
	    System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
}
