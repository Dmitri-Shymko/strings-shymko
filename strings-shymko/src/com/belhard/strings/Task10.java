package com.belhard.strings;

import java.util.regex.Pattern;

public class Task10 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s+");
		String[] words = pattern.split(DemoStrings.TEXT);
		String longestWord = "default";
		int maxLength = 0;

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
				longestWord = words[i];
			}

		}

		System.out.printf("Longest word of your text is: --%s-- and it length is %d.", longestWord, maxLength);

	}

}
