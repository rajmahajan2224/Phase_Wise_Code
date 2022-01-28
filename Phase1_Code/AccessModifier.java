package com.mahajan;

public class AccessModifier {
	
	public int a = 100;
	private int b = 200;
	int c = 300;
	protected int d = 400;
	void show()
	
	{
		System.out.println("Public A = " + a);
		System.out.println("Private B = " + b);
		System.out.println("Default C = " + c);
		System.out.println("protected D = " + d);
	}
	
	static class AccessModifiers1
	{
		public static void main(String[] args) {
			AccessModifier access = new AccessModifier();
			access.show();
		}
	}

}
