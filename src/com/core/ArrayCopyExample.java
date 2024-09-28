package com.core;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5 };

		// Using System.arraycopy()
		int[] copy1 = new int[original.length];
		System.arraycopy(original, 0, copy1, 0, original.length);

		// Using Arrays.copyOf()
		int[] copy2 = Arrays.copyOf(original, original.length);

		// Using clone()
		int[] copy3 = original.clone();

		// Using Arrays.copyOfRange()
		int[] copy4 = Arrays.copyOfRange(original, 0, original.length);

		// Using a loop
		int[] copy5 = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			copy5[i] = original[i];
		}

		// Print all copies to verify
		System.out.println("copy1: " + Arrays.toString(copy1));
		System.out.println("copy2: " + Arrays.toString(copy2));
		System.out.println("copy3: " + Arrays.toString(copy3));
		System.out.println("copy4: " + Arrays.toString(copy4));
		System.out.println("copy5: " + Arrays.toString(copy5));
	}
}
