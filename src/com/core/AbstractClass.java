package com.core;

interface Intrfc {
	void interf();
}

abstract class aw implements Intrfc {
	void add() {
		System.out.println("abstract1");

	}

	void clasmethode() {
		System.out.println(" clasmethode in abstract1");
	}

	abstract void abstrctmethod();
}

abstract class bw extends aw {
	void add() {
		System.out.println(" add abstract2");

	}

	void show() {
		System.out.println("in show abstract2");
	}

	abstract void abstrctmethod2();
}

public class AbstractClass extends bw {

	public static void main(String[] args) {
		aw obj = new AbstractClass();
		obj.add();
		obj.clasmethode();
		obj.abstrctmethod();
		bw obj2 = new AbstractClass();
		obj2.abstrctmethod();
		obj2.show();
		obj2.abstrctmethod2();
		obj2.add();
		obj2.clasmethode();
	}

	@Override
	void abstrctmethod() {
		System.out.println("over ride abstrctmethod");
	}

	@Override
	void abstrctmethod2() {
		System.out.println("over ride abstrctmethod2");

	}

	@Override
	public void interf() {
		System.out.println("over ride interf");

	}

}
