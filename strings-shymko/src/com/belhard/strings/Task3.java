package com.belhard.strings;

public class Task3 {

	public static void main(String[] args) {
		int str = DemoStrings.NUMBERS.replaceAll("[^0-9]+", "").length();
		
		System.out.println("Number of digits is: " + str);
	}

}
