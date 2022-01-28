package com.mahajan;

public class DiamondProblem {
	
	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	
	public static class Diamond implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    
	    public static void main(String args[]) 
	    { 
	        Diamond ob = new Diamond(); 
	        ob.show(); 
	    } 
	}
}
