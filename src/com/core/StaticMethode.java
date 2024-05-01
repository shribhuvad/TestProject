package com.core;

import java.io.IOException;

class Child {
	private void method() {
	}

	static void show() throws IOException {
		System.out.println("In parent");
	}

	void a() {
	}

}

public class StaticMethode extends Child {

	void test() {
//		StaticMethode obj = new StaticMethode();
		super.a();
	}

	static void show() throws IOException {
		System.out.println("in child");

	}

	public static void main(String[] args) {
		// StaticMethode obj = new StaticMethode();
		Child obj = new StaticMethode();
		try {
			obj.show();
			obj.a();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}