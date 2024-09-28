package com.exception;

import java.io.IOException;

class parent {

	void method() throws IOException {
	}
}

class child extends parent {
	void method() throws RuntimeException {
	}
}

public class ExceptionOverride {

	public static void main(String[] args) {
		parent p = new child();
	}
	/*
	 * 01-Jun-2024
	 */}
