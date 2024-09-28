package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ArraylistOperation {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 1, 5);

		Optional<Integer> num = numbers.stream().max(Comparator.comparing(Function.identity()));

		System.out.println(num.get());

		Collections.sort(numbers);

		Collections.sort(numbers, Collections.reverseOrder());
	
		System.out.println(numbers.get(numbers.size() - 1));
	}

}
