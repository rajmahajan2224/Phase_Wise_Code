package com.mahajan;

public class MethodWork {
	
	public int multiplyNumber(int x, int y) {
		int z = x * y;
		return z;
	}
	
	public static void main(String [] args) {
		MethodWork mw = new MethodWork();
		int ans = mw.multiplyNumber(20, 40);
		System.out.println("Multiplication is: " + ans);
	}

}
