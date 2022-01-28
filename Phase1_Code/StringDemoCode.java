package com.mahajan;

public class StringDemoCode {
	
	public static void main(String [] args) {
		
		//methods of strings
		
		System.out.println("Methods of Strings");
		String a1 = new String("Hey, there");
		System.out.println(a1.length());
		
		//substring
		
		String sub = new String("Welcome");
		System.out.println(sub.substring(2));
		
		//String Comparison
		
		String b1="Hey";
		String b2="there";
		System.out.println(b1.compareTo(b2));
		
		//IsEmpty
		
		String b4="";
		System.out.println(b4.isEmpty());
		
		//toLowerCase
		
		String b5="Hey";
		System.out.println(b1.toLowerCase());
		
		//replace
		
		String b6="Hello";
		String replace = b2.replace('l', 'a');
		System.out.println(replace);
		
		//equals
		
		String i = "Welcome to Arsenal Football Club";
		String j = "Welcome to Real Madrid FC";
		System.out.println(i.equals(j));
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		//Creating StringBuffer and append method
		
		StringBuffer s=new StringBuffer("Welcome to Emirates Stadium!");
		s.append("Enjoy your game");
		System.out.println(s);
		
		//insert method
		
		s.insert(0, 'w');
		System.out.println(s);
		
		//replace method
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		
		//delete method
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Enjoyable");
		sb1.append("Game");
		System.out.println(sb1);
		System.out.println(sb1.delete(0, 1));
		System.out.println(sb1.insert(1, "Welcome"));
		
		System.out.println(sb1.reverse());
		
		//conversion
		
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		String str = "Hello"; 
		 
		 // conversion from String object to StringBuffer
		
		 StringBuffer sbr = new StringBuffer(str); 
		 sbr.reverse(); 
		 System.out.println("String to StringBuffer");
		 System.out.println(sbr); 
		 
		 // conversion from String object to StringBuilder
		 
		 StringBuilder sbl = new StringBuilder(str); 
		 sbl.append("world"); 
		 System.out.println("String to StringBuilder");
		 System.out.println(sbl);
	}
}
