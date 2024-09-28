package com.test;

public class Test {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 8, 9 };

		int count = 1;
		for (int i = 0; i < a.length-1; i++) {
		

			if (a[i + 1] - a[i] != 1) {
				System.out.println(a[i]+1);
			}

		}

	}

}
