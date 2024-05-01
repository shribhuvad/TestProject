package com.core;

class Pclass {
	public int c;

	void show() {
		System.out.println("in show");
	}

	void superclassMethode() {
		System.out.println("in super class");
	}
}

class Classc extends Pclass {

	void b() {
		Pclass a = new Classc();

		a.show();
		System.out.println(a.c);
		a.superclassMethode();
		// a.d();
	}

	void superclassMethode() {
		System.out.println("in subclass");
	}

	void d() {
	}
}
public class Interfcereferenceobject {

	public static void main(String args[]) {
		Pclass obj = new Classc();
		System.out.println("start");
		obj.show();
	}

}