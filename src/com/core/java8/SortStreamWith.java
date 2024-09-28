package com.core.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStreamWith {

	public static void main(String[] args) {

		Employee obj = new Employee(1, "Shri");
		Employee obj2 = new Employee(2, "Test");

		// System.out.println(map.get("b"));

		List<Employee> list = new ArrayList<>();
		list.add(obj);
		list.add(obj2);

		sort(list);

	}

	private static void sort(List<Employee> list) {
		list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

	}

}
