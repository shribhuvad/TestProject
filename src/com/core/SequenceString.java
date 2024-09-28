package com.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceString {

	public static void main(String[] args) {

		List<Character> listOfchar = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
		List<String> list = new ArrayList<String>();
		String s = "abcfghdef";
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {

			char test = s.charAt(i);
			temp = i;
			StringBuffer str = new StringBuffer();
			str.append(test);

			int index = listOfchar.indexOf(test);

			for (int j = index + 1; j < listOfchar.size() && str.length() > temp; j++) {

				if (listOfchar.get(j).equals(s.charAt(++temp))) {
					str.append(s.charAt(temp));
				} else
					break;

			}
			if (str.length() > 1) {
				list.add(str.toString());
			}

		}
		System.out.println(list);

	}

}
