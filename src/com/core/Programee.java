package com.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Programee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 6, 3, 4 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		Map<String, String> unsrted = new HashMap<>();
		unsrted.put("mango", "dd");
		unsrted.put("apple", "dd");
		unsrted.put("bb", "s");
		System.out.println(unsrted.get(null));
		
	

		Map<String, String> sorted = new TreeMap<String, String>(unsrted);

		for (Map.Entry<String, String> entry : sorted.entrySet()) {
			System.out.println(entry.getKey());

		}

	}

}
