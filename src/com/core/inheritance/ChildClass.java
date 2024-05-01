package com.core.inheritance;

public class ChildClass extends Parent1 {

	public static void main(String args[]) {
		ChildClass obj = new ChildClass();
		obj.Parent1Method1();

		Parent1 obj2 = new ChildClass();
		obj2.Parent1Method1();
	}

	void ChildClassMethod1() {
		System.out.println("ChildClass Method ChildClassMethod1()");

	}

	@Override
	void Parent1Method1() {
		System.out.println("PArent1 Method show() overide in ChildClass");
	}
}
