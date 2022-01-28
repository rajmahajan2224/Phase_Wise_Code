package com.mahajan;

public class OverloadMethod {
	public void area(int a, int b) {
		System.out.println("Area of Triangle : " + (0.5 * a * b));
	}
	
	public void area(int c) {
		System.out.println("Area of Circle : " + (3.14 * c * c));
	}
	
	public static void main(String [] args) {
		OverloadMethod om = new OverloadMethod();
		om.area(5, 10);
		om.area(4);
	}
}
