package com.belhard.strings;

import com.belhard.util.StringUtil;

public class Task6 {

	public static void main(String[] args) {
		String str = DemoStrings.SPACES;
		int result = StringUtil.maxNumberSpaces(str);

		System.out.println("Maximum number of spaces between two words in expression is: " + result);

	}

}
