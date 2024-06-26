package com.core.java8;

@FunctionalInterface
interface sayable {
	void say(String msg); // abstract method
	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);

	default void shri() {
		System.out.println("in SHRI");

	}
}

public class FunctionalInterfaceExample2 implements sayable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		sayable fie = new FunctionalInterfaceExample2();
		fie.say("Hello there");
		fie.shri();
	}
}