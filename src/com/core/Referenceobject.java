package com.core;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}

	void makeSuperSound() {
		// Invoke the overridden method from the superclass
		super.makeSound();
	}
}

public class Referenceobject {

	public static void main(String args[]) {
		Dog dog = new Dog();
		dog.makeSound(); // Output: Dog barks
		dog.makeSuperSound();
	}

}