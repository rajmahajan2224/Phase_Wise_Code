package com.mahajan;

public class InnerClass1 {
		private String msg = "Hello Inner Class";
		void display() {
			class Inner1 {
				void msg() {
					System.out.println(msg);
				}
			}
			Inner1 a = new Inner1();
			a.msg();
		}
		
		public static void main(String [] args) {
			InnerClass1 ob = new InnerClass1();
			ob.display();
	}
}


