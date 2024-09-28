package com.core;

import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 *28-May-2024
 */
public class ArrayToList {

	public static void main(String args[]) {
		String array[] = { "Geeks", "forGeeks", "A computer Portal" };

		List<String> list = Arrays.asList(array);
		System.out.println(list);
		String str = "STR STR SHRI";

		String array2[] = str.split(" ");
		//

		List<String> list2 = Arrays.asList(array2);

		String strChar = "shrinivass";
		List<char[]> charList = Arrays.asList(strChar.toCharArray());

	}

}
