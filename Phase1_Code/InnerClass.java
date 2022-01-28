package com.mahajan;

class InnerClass {
	
	private String message = "Hey, Raj Here";
	class Inner {
		void hello() {
			System.out.println(message + ", Lets learn about Inner Class ");
		}	
	  }
		
	public static void main(String [] args) {
		InnerClass obj = new InnerClass();
		InnerClass.Inner in = obj.new Inner();
		in.hello();
	}	
 }
