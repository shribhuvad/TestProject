package com.core.pattern;

public class SingletoneExample {
	static int a;
	private static SingletoneExample obj;

	private SingletoneExample() {

	}

	public static SingletoneExample getObj() {
		synchronized (SingletoneExample.class) {
			if (obj == null) {
				obj = new SingletoneExample();

			}
		}
		return obj;

	}

}

class test {

	public static void main() {
		SingletoneExample a = SingletoneExample.getObj();
	}

	void test() {
	}
}