package com.belhard.strings;

public class Task9 {

	public static void main(String[] args) {
		String str = DemoStrings.TEXT;
		String regex = "b";
		int result = str.length() - str.replaceAll(regex, "").length();
		
		System.out.printf("Number of leters %s is; %d", regex, result);

	}

}
