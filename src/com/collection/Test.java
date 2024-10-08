package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		String str1 = "shri";
		String str2 = "shria";
		System.out.println(str1.compareTo(str2));

		List<String> list = Arrays.asList("Francis", "Mary", "John", "Cal", "Joel", "Sam", "Kristy");

		List<String> newList = list.stream().filter(str -> (str.length() > 3)).map(str -> str.toUpperCase())
				.collect(Collectors.toList());
		;

		Collections.sort(newList);

//		List<Integer> newList = new ArrayList<>();
///			try   {
//
//				int a = Integer.parseInt(str);
//				newList.add(a);
//
//			} catch (Exception e) {
//
//			}
//
//		}
//
		System.out.println(newList);
//	}
	}

}
