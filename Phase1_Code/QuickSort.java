package com.mahajan;

import java.util.Arrays;

public class QuickSort {
       static int partition(int [] arr, int left, int right) {
    	   int pivot = arr[right];
    	   int i = left - 1;
    	
    	   for(int j = left; j < right; j++) {
    		   if(arr[j] <= pivot) {
    			   i++;
    			   
    			   int temp = arr[i];
    			   arr[i] = arr[j];
    			   arr[j] = temp;
    		   }
    	   }
    	   
    	   int temp = arr[i+1];
    	   arr[i+1] = arr[right];
    	   arr[right] = arr[temp];
    	   
    	   return(i+1);
       }
       
       static void quickSort(int[] arr, int left, int right) {
    	   if(left < right) {
    		   int part = partition(arr, left, right);
    		   quickSort(arr, left, part-1);
    		   quickSort(arr, part+1, right);
    	   }
       }
       
       public static void main(String [] args) {
    	   int[] arr = {8, 7, 2, 1, 0, 9, 6};
    	   System.out.println("Unsorted array : ");
    	   System.out.println(Arrays.toString(arr));
    	   
    	   int size = arr.length;
    	   QuickSort.quickSort(arr, 0, size-1);
    	   
    	   System.out.println("Sorted arrays is : ");
    	   System.out.println(Arrays.toString(arr));
       }
}
