package com.core.interfaces;

public class Test {
	String shri;
	int q = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test();
		System.out.println(a.q == 2);
		if (a.shri == null) {
			System.out.println("sssssss");
		}
		// System.out.println((a.shri.length()>1));
		String s = new String("ss");
		String s1 = new String("ss");
		System.out.println(s == s1);
		d obj = new d();

	}

}

class d {
	int a;

	void show() {
		System.out.println("in show");
	}

	static {
		// a=0;
		System.out.println("in static");
	}
}
