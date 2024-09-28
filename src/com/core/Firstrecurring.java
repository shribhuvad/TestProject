
package com.core;

import java.awt.Label;
import java.util.Arrays;
import java.util.Scanner;

public class Firstrecurring {

	public static void main(String[] args) {

		String s = "shris";
		System.out.println(s);
		char ary[] = s.toCharArray();

		System.out.println(Arrays.toString(ary));

		outerloop: for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] == ary[j]) {
					System.out.println("first occurence is " + ary[i]);
					break outerloop;
				}

			}
		}

	}

}
