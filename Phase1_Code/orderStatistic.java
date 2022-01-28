package com.mahajan;

import java.util.Arrays;

public class orderStatistic {
	public static int kthSmallest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];
	}
	
	public static void main(String [] args) {
		int[] arr = new int[] {12, 3, 5, 7, 19 };
		int k = 3;
		System.out.println("Kth Smallest element is : " + kthSmallest(arr, k));
	}
}
