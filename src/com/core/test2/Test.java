package com.core.test2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shri";
		s += "ee";
		System.out.println(s);
		A a = new A();
		a.display();
	}

}

class B {
	static int a = 0;

	B() {
		a = 10;
		System.out.println("b is created");
	}

	void print() {
		System.out.println("hello b");
	}

}

class A {
	B b;

	A() {
		System.out.println("a is created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	void print() {
		System.out.println("hello a");
	}

	void display() {
		print();
		b.print();
	}
}