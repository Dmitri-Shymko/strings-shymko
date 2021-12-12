package com.belhard.strings;

public class Task7 {
	public static void main(String[] args) {
		String str = DemoStrings.BLACK_WHITE.replaceAll("a", "ab").replaceAll("A", "AB");

		System.out.println("Edited expression: " + str);
	}

}
