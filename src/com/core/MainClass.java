package com.core;

class Ab {
	static void staticMethod() {
		System.out.println("Static Method");
	}
}

class Ab1 {
	static int i = 111;
	static {
		i = i-- - --i;
		System.out.println("in Ab1 static " + i);
	}
	{
		i = i++ + ++i;
		System.out.println("in Ab1 block " + i);

	}
}

class Bb1 extends Ab1 {
	static {
		i = --i - i--;
		System.out.println("in Bb1 static " + i);
	}
	{
		i = ++i + i++;
		System.out.println("in Bb1 block " + i);
	}
}

class Ab2 {
	int methodOfA() {
		return (true ? null : 0);// null pointer exception
	}
}

public class MainClass {
	public static void main(String[] args) {
		//Ab a = null;
	//	a.staticMethod();
		//
		Bb1 b = new Bb1();
		System.out.println(b.i);

		// System.out.println(new Ab2().methodOfA());
	//	check();

		System.out.println(methodOne(11));

	}

	static void check() {
		System.out.println("Inside check");

		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);

		// Integer i = new Integer(null);
		// String s = new String(null);

		String s = "ONE" + (1 + 2) + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(s);

		int i = 10 + +11 - -12 + +13 - -14 + +15;
		System.out.println(i);
	}

	static int methodOne(int i) {
		return methodTwo(i *= 11);
	}

	static int methodTwo(int i) {
		return methodThree(i /= 11);
	}

	static int methodThree(int i) {
		return methodFour(i -= 11);
	}

	static int methodFour(int i) {
		return i += 11;
	}

}
