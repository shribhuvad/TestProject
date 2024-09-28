package com.core.java8;

public class Pattern {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello123World";

		boolean containsInteger = str.chars().anyMatch(Character::isDigit);

		if (containsInteger) {
			System.out.println("The string contains an integer.");
		} else {
			System.out.println("The string does not contain an integer.");
		}
	}
}
