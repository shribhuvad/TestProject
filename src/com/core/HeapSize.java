package com.core;

public class HeapSize {

	public static void main(String[] args) {// Get the runtime reference
		Runtime runtime = Runtime.getRuntime();

		// Print the current heap size
		System.out.println("Heap Size = " + runtime.totalMemory() / (1024 * 1024) + " MB");

		// Print the maximum heap size
		System.out.println("Max Heap Size = " + runtime.maxMemory() / (1024 * 1024) + " MB");

		// Print the amount of free memory in the heap
		System.out.println("Free Heap Size = " + runtime.freeMemory() / (1024 * 1024) + " MB");
	}

}
