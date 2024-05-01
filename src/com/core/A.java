package com.core;

public class A {

	// int var=2147483648; //2147483647
	Integer var2 = 214748364;

	void testA() {
		System.out.println("class A");
	}

	public void testA1() throws ArithmeticException {
		System.out.println("class A");
	}

}

class B extends A {
	public void testB() {
		System.out.println("Class B");
	}

	public void testA1() throws RuntimeException {
		System.out.println("Class B");
	}
}

class C extends B {
	public void tectC() {
		System.out.println("class c");
	}
}

class Test {
	public static void main(String args[]) {

		A a = new A();
		B b = new B();
		C c = new C();
		c = (C) a;// w
		// c = a;// w
		c = (C) b;// w
		// c = b;
		// w b = (B) a;// w
		// b = a;// w
		b = (C) c;// c
		b = c;// c
		a = (C) c;// c
		a = c;// c
		a = (B) b;// c
		a = b; // c
		c.testA();

	}

}