package com.mahajan;

public class ExceptionHandlingConcept  extends Exception{
	
	   String str1;
	   ExceptionHandlingConcept(String str2) {
		str1=str2;
	   }
	   
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}

	class Example{
	   public static void main(String args[]){
		   
		try{
			System.out.println("Starting of try block");
			throw new ExceptionHandlingConcept("This is My error Message");
		}
		catch(ExceptionHandlingConcept exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		  }
	  }
}
