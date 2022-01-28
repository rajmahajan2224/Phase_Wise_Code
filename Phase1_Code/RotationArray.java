package com.mahajan;

public class RotationArray {
	
     public void rotataion(int[] nums, int a) {
		
		if(a > nums.length) 
   			a = a % nums.length;
		
		int[] result = new int[nums.length];
		
		for(int i = 0; i < a; i++) {
    			result[i] = nums[nums.length - a + i];
		}
		
		int j=0;
		
		for(int i = a; i < nums.length; i++) {
    			result[i] = nums[j];
                j++;
		}
		
		System.arraycopy( result, 0, nums, 0, nums.length );
		
        }

    public static void main(String[] args) {
    	RotationArray ra = new RotationArray();
    		int arr[] = {2, 9, 8, 5, 6, 1, 4}; 
    		ra.rotataion(arr, 5); 
    		for(int i=0;i<arr.length;i++) {
        		System.out.print(arr[i]+" ");
    	}
    }
}
