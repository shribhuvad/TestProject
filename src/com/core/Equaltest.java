package com.core;

public class Equaltest {
	public static void main(String[] args) {
		String str1 = new String("ABCD");
		String str2 = new String("ABCD");
	String s3=str2;
	
	if (s3==str2)
	{
		System.out.println("in loop1");
	}
	if (str1==str2)
	{
		System.out.println("in loop2");
	}
	
	}
}