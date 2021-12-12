package com.belhard.strings;

public class Task4 {

	public static void main(String[] args) {
		String str = DemoStrings.NUMBERS.replaceAll("[^0-9]+", " ").trim()
				.replaceAll("[0-9]+", "1")
				.replaceAll("\\s+","");
		
		System.out.println("Number of numbers is: " + str.length());
		
	}

}
