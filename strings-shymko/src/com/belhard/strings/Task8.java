package com.belhard.strings;

public class Task8 {

	public static void main(String[] args) {

		String variable = DemoStrings.PALINDROME;
		StringBuffer rev = new StringBuffer(variable).reverse();
		String strRev = rev.toString();

		if (variable.equalsIgnoreCase(strRev)) {
			System.out.printf("Word --%s-- is palindrom.", variable);
		} else {
			System.out.printf("Word --%s-- isn't palindrom. Try again.", variable);
		}

	}

}
