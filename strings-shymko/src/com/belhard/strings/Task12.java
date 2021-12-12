package com.belhard.strings;

import java.util.regex.Pattern;

public class Task12 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\.+");
		String[] sentence = pattern.split(DemoStrings.BLACK_WHITE);
		int numberOfSentences = sentence.length;

		System.out.println("Number of sentences is: " + numberOfSentences);
	}

}
