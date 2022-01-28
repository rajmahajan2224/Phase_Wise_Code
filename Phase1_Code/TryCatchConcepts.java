package com.mahajan;

public class TryCatchConcepts {
	
	public static void main(String args[]) 
    {
        int[] arr = new int[4];
        try 
        {
            arr[5] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        
        finally 
        {
            System.out.println("The array is of size " + arr.length);
        }
    }
}
