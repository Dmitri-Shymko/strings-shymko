package com.belhard.strings;

public class Task1 {

	public static void main(String[] args) {
		String str = DemoStrings.CAMELCASE.replaceAll("([^A-Z])([A-Z0-9])", "$1_$2")
				.replaceAll("([A-Z]+)([A-Z0-9][^A-Z]+)", "$1_$2")
				.replaceAll("([0-9]+)([a-zA-Z]+)", "$1_$2")
				.toLowerCase();
		
		System.out.println("Edited expression: " + str);

	}

}
