package com.exception;

public class FinalBlock {

	public static void main(String[] args) {

		System.out.println(callException());

	}

	private static int callException() {

		try {

			// int b = 1 / 0;
			return 4;

		}

		catch (Exception e) {
			return 3;
		}

		finally {
			return 2;

		}
	}
}
