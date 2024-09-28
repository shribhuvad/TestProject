package com.collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * @author admin 28-May-2024
 */
public class UnmodifiableListExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a modifiable list
		List<String> modifiableList = new ArrayList<>();
		modifiableList.add("Apple");
		modifiableList.add("Banana");
		modifiableList.add("Cherry");

		// Create an unmodifiable list from the modifiable list
		List<String> unmodifiableList = Collections.unmodifiableList(modifiableList);

		// Print the unmodifiable list
		System.out.println("Unmodifiable List: " + unmodifiableList);

		// This work no any error//
		// unmodifiableList = new ArrayList<>();

		// This work
		modifiableList.add("Sgte");

		// Attempting to modify the unmodifiable list will throw an exception
		try {
			unmodifiableList.add("Date");
		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException caught: Cannot modify unmodifiable list");
		}
	}
}
