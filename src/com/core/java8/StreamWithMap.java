package com.core.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamWithMap {

	public static void main(String[] args) {
		sort();
	}

	private static void sort() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
		System.out.println();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::print);

	}

}
