package com.core;

public class Pattern {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 pattern4();
	 System.out.println();
	 System.out.println();


	 pattern3();
	
	 System.out.println();
	 System.out.println();
     pattern2();

System.out.println();
System.out.println();
pattern();

	}

	private static void pattern4() {
		for (int i = 0; i < 4; i++) {

			for (int j2 = 4; j2 > i; j2--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i + 1; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	private static void pattern3() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {

			for (int j2 = 4; j2 > i; j2--) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i + 1; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}

	private static void pattern2() {

		int index = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(index++);
			}
			System.out.println();
		}

	}

	private static void pattern() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i + 1; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
	}

	
	
}
