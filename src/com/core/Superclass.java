package com.core;

class Superclass {
	int num = 10;

	void display() {
		System.out.println("Superclass method");
	}

	void display2() {
		System.out.println("Superclass method");
	}
}

class Subclass extends Superclass {

	int num = 20;

	void display() {
		System.out.println("Subclass method");
		System.out.println("Value of num in subclass: " + num);
		System.out.println("Value of num in superclass: " + super.num);
		super.display(); // Call superclass method
	}

	void test() {
		display2();

	}
}
