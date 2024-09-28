package com.core;

interface inta {
	void show();

	int a = 1;
	int s = 99;

}

interface intb extends inta {

	int a = 0;

}

public class Interfaces implements inta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces obj = new Interfaces();
		// int a=obj.a; //The field obj.a is ambiguous
		System.out.println(obj.s);
		inta obj2 = new Interfaces();
		int a = obj2.a;
		System.out.println(a);

//		intb obj3 = new Interfaces();
//		a = obj3.a;
//		System.out.println(a);

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	}

}
