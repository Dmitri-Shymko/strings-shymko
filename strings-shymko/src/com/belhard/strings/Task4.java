package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+");
		Matcher matcher = pattern.matcher(DemoStrings.NUMBERS);

		int numberOfNumbers = 0;
		while (matcher.find()) {
			numberOfNumbers++;
		}
		System.out.println("Number of numbers is: " + numberOfNumbers);

	}

}
