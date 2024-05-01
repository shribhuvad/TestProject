package com.core;

import java.io.*;

class Parent {
	void msg() throws NullPointerException {
		System.out.println("parent");
	}
}

class TestExceptionChild5 extends Parent {
	void msg() throws RuntimeException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild5();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}

	class Parent2 {
		void msg() throws ArithmeticException {
			System.out.println("parent");
		}
	}

	class TestExceptionChild2 extends Parent2 {
		void msg() {
			System.out.println("child");
		}
	}

}