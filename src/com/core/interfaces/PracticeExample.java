
package com.core.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Remove duplicate from string
		// removeDuplicate();
		totalnumberOfoccurence();
		fibonaciseries();
	}

	static void fibonaciseries() {
		int a = 0;
		int b = 1;
		int c = 0;
		int count = 0;
		while (count++ < 10) {
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}

	static void totalnumberOfoccurence() {
		String str = "shrinivass";
		char a[] = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : a) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> c : map.entrySet()) {
			System.out.println(c.getValue() + "  " + c.getKey());
		}

	}

	static void removeDuplicate() {
		String str = "shrinivass";
		String withoutDuplicare = "";
		int l = str.length();
		String strA[] = { "jh" };

		Set<Character> set = new HashSet<Character>();
		for (int i = l - 1; i > 0; i--) {
			char a = str.charAt(i);
			if (set.contains(a)) {
			} else {
				set.add(a);
				withoutDuplicare += a;
				;
			}

		}
		System.out.println(withoutDuplicare);

	}

}
