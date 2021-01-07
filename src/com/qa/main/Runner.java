package com.qa.main;

public class Runner {

	
	public static void main(String[] args) {
		
		StringMethods sm = new StringMethods();
		
		System.out.println(sm.replaceEsWithCheese("e e e e e"));
		System.out.println(sm.checkIfStringEndsWithSon("Nick Johnson"));
		System.out.println(sm.reverseAString("chicken"));
		System.out.println(sm.returnOnlyThe3rdTo6thCharactersOfAString("abcdef"));
		System.out.println(sm.makeLowercase("HELLO I AM A BOOMER TYPING IN ALL CAPS"));
		System.out.println(sm.convertIntegerToString(1355417));
		
		// bonus: converting an integer to a string using the Integer wrapper class
		int num = 6;
		String convertedInteger = Integer.toString(num);
		System.out.println(convertedInteger.getClass());
	}
	
	
}
