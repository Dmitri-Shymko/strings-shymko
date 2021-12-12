package com.belhard.strings;

public class Task11 {

	public static void main(String[] args) {
		int numberOfLowercase = DemoStrings.TEXT.replaceAll("[^a-z]+", "").length();
		int numberOfUppercase = DemoStrings.TEXT.replaceAll("[^A-Z]+", "").length();

		System.out.println("The number of letters in lowercase is: " + numberOfLowercase);
		System.out.println("The number of letters in uppercase is: " + numberOfUppercase);
	}

}
 