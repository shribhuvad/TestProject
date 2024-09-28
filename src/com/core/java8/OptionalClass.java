package com.core.java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = getAddress(null).orElseGet(() -> ("Default Street"));
		System.out.println(address);

	}

	public static Optional<String> getAddress(String string) {
		return Optional.ofNullable(string).map(str -> str).map(str -> str);
	}

	// Handling the optional value

	/*
	 * 14-Jun-2024
	 */}
