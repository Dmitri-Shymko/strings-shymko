package com.belhard.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task14 {

	public static void main(String[] args) {
		String str = DemoStrings.REPEATED_SYMBOLS.replaceAll("[^a-zA-Z0-9]","");	
		
		char[] chars = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		
		System.out.println(sb.toString());
		
	}

}
