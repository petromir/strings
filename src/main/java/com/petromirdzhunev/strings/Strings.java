package com.petromirdzhunev.strings;

public class Strings {

	public static boolean isEmpty(CharSequence str) {
		return str == null || str.isEmpty();
	}

	public static boolean isNotEmpty(CharSequence str) {
		return !isEmpty(str);
	}
}
