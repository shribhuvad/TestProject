package com.core.exception;

import java.io.IOException;

class OverrideException {
	public void myMethod() throws IOException {
		// method implementation
	}

	public void myMethod2() throws RuntimeException {
		// overridden method without exception
	}
}

class SubClass extends OverrideException {
	@Override
	public void myMethod() throws RuntimeException {
		// overridden method without exception
	}

	@Override
	public void myMethod2() throws IOException {
		// method implementation
	}
}
