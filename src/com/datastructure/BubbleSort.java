package com.datastructure;

import java.util.Arrays;

/**
 * 20-May-2024
 * 
 * @author admin
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 4, 1, 1, 9, 8, 0 };

		for (int i = 0; i < a.length-1; i++) {

			for (int j = 0; j < a.length - i-1; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;

				}
			}
			//System.out.println(Arrays.toString(a));

		}

		System.out.println(Arrays.toString(a));
	}

}
