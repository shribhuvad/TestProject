package com.core;

import java.util.ArrayList;
import java.util.List;

public class TestInterview {

	public static void main(String[] args) {
		Dub obj = new Dub();
		System.out.println(obj.something());
		String s1 = "sss";
		String s2 = s1 + 1;
		System.out.println(s2);

		System.out.println("s2 " + s2);
		String s3 = s1 + "2";
		String s4 = s1 + s1.length();
		System.out.println("s4 " + s4);
		shri obj2 = new shri();
		obj2.a = 1;

	}

}

class Dub {
	int something() {
		int i;
		return i = 6;
	}
}

class Child1 extends Dub {
	// List<Dub> list=new ArrayList<Child1>();

	List<Child1> list2 = new ArrayList<Child1>();

}

final class shri {
	int a = 0;

}