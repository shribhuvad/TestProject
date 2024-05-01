package com.core;

class awc {
	void add() {
		System.out.println("shri");

	}

	void inawc() {
	}

}

class bwc extends awc {
	void add() {
		System.out.println("shri2");

	}

	void show() {
		System.out.println("show bwc");
	}

	void oVeride() {
		System.out.println("shri");

	}
}

public class UpcastingClass extends bwc {

	public static void main(String[] args) {

		bwc obj = new UpcastingClass();

		obj.add();
		obj.oVeride();
		obj.show();
	}

	void iNUpcastingClass() {
	}

	void oVeride() {
		System.out.println("in UpcastingClass");

	}
}
