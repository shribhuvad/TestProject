package com.core;

import java.io.IOException;

public class EXception {

	void m()   throws IOException,NullPointerException //throws IOException
	{
	     throw new IOException("device error");//checked exception
		//throw new NullPointerException();
	}

	void n() {
		throw new NumberFormatException();
	}
     
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		EXception obj = new EXception();
		obj.p();
		System.out.println("normal flow...");
	}
}
