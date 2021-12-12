package com.belhard.strings;

public class Task2 {

	public static void main(String[] args) {
		String str = DemoStrings.BLACK_WHITE.replaceAll("(?i)black", "white");
		
		System.out.println("Edited expression: " + str);
	}

}
