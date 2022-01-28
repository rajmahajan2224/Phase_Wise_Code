package com.mahajan;

import java.util.regex.*;

public class RegularExpression {
	 
	public static void main(String [] args) {
		String pattern = "[a-z] + ";
		String Checker = "Regular Expression";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(Checker);
		while(m.find()) {
			System.out.println(Checker.substring(m.start(), m.end()));
		}
	}
}
