package com.belhard.util;

public class StringUtil {

	public static int maxNumberSpaces(String expression) {
		int max = 0, curmax = 0;
		for (char c : expression.toCharArray()) {
			if (c == ' ') {
				curmax++;
				if (curmax > max)
					max = curmax;
			} else
				curmax = 0;
		}
		return max;
	}

}
