package com.belhard.strings;

public class Task5 {

	public static void main(String[] args) {
		String str = DemoStrings.SPACES.replaceAll("\\s+"," ").trim().replaceAll("\\s\\.", ".");
		
		System.out.println("Original expression: \t" + DemoStrings.SPACES);
		System.out.println("Edited expression: \t" + str);
		
	}

}
