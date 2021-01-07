package com.qa.main;

public class StringMethods {

	public String replaceEsWithCheese(String input) {
		String output = "";
		output += input.replace("e", "cheese");
		return output;
	}
	
	public String checkIfStringEndsWithSon(String input) {
		String output = "";
		output += input.contains("son");
		return output;
	}
	
	public String reverseAString(String input) {
		String output = "";
		
		// run through the input string backwards
		// and for each character in that input string
		// add them to the output string
		
		for (int i = input.length()-1; i >= 0; i--) {
			 output += input.charAt(i);
		}
		
		return output;
	}
	
	public String returnOnlyThe3rdTo6thCharactersOfAString(String input) {
		// given a string with at least 6 characters in it
		// return only the characters from positions 3 to 6
		String output = "";
		
		if (input.length() < 6) {
			return "not enough characters!";
		} else {
			output += input.substring(3, 6);
		}
		
		return output;
	}
	
	public String makeLowercase(String input) {
		String output = "";
		output += input.toLowerCase();
		return output;
	}
	
	public String convertIntegerToString(int input) {
		String output = "";
		output += input;
		return output;
	}
	
}
