package com.test;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticalSequences {
	public static void main(String[] args) {
		// Example input string
		String input = "abcxabczabcdeftzabc";
		System.out.println(input.charAt(1)+1);
		// Call the method to find alphabetical sequences
		List<String> sequences = findAlphabeticalSequences(input);

		// Print the sequences
		System.out.println("Alphabetical sequences: " + sequences);
	}

	public static List<String> findAlphabeticalSequences(String input) {
		List<String> sequences = new ArrayList<>();
		StringBuilder currentSequence = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			if (i == 0 || input.charAt(i) == input.charAt(i - 1) + 1) {
				// Continue the sequence
				currentSequence.append(input.charAt(i));
			} else {
				// Sequence breaks, store the current sequence if it's non-empty
				if (currentSequence.length() > 1) {
					sequences.add(currentSequence.toString());
				}
				// Start a new sequence
				currentSequence.setLength(0);
				currentSequence.append(input.charAt(i));
			}
		}

		// Store the last sequence if it's non-empty and valid
		if (currentSequence.length() > 1) {
			sequences.add(currentSequence.toString());
		}

		return sequences;
	}
}
