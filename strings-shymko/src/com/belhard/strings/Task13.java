package com.belhard.strings;

public class Task13 {

	public static void main(String[] args) {
		String str = DemoStrings.TEXT.replaceAll(".", "$0$0");
		System.out.println(str);
	}

}
