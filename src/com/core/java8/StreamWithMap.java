package com.core.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithMap {

	public static void main(String[] args) {
		// sort();
		// sortMapOfList();
		// map();
		mapSort();
	}

	private static void mapSort() {
		Map<Integer, Employee> map3 = new HashMap<>();
		map3.put(1, new Employee(0, "John"));
		map3.put(2, new Employee(1, "Alice"));
		map3.put(3, new Employee(2, "Bob"));

		Set<Entry<Integer, Employee>> set = map3.entrySet();

		List<Entry<Integer, Employee>> newMap = map3.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName, Comparator.reverseOrder())))
				.collect(Collectors.toList());

		LinkedHashMap<Integer, Employee> sortedMap2 = new LinkedHashMap<>();
		newMap.stream().forEach(s -> {
			sortedMap2.put(s.getKey(), s.getValue());

		});

		System.out.println("sortedMap2 " + sortedMap2);

		// Step 1: Convert the map to a list of entries
		List<Entry<Integer, Employee>> entryList = new ArrayList<>(map3.entrySet());

		// Step 2: Sort the list based on the employee name
		entryList.sort(Comparator.comparing(entry -> entry.getValue().getName()));

		// Step 3: Convert the sorted list back to a map (if necessary)
		LinkedHashMap<Integer, Employee> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, Employee> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		// Printing the sorted map
		sortedMap.forEach((key, value) -> System.out.println(key + ": " + value));
	}

	private static void map() {
		// TODO Auto-generated method stub
		Map<Integer, Employee> map3 = new HashMap();

		map3.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toSet());
	}

	private static void sortMapOfList() {
		Employee obj3 = new Employee(3, "Test3");
		Employee obj = new Employee(1, "Shri");
		Employee obj2 = new Employee(2, "Test");
		List<Employee> list = new ArrayList<>();
		list.add(obj3);

		list.add(obj);
		list.add(obj2);
		Map<Integer, List<Employee>> map = new HashMap<>();
		map.put(1, list);

		map.entrySet().stream().forEach(s -> {

			System.out.println(s.getKey() + " " + s.getValue());
		});
		list.stream().sorted();

		list.stream().sorted(Comparator.comparing(Employee::getId));

	}

	private static void sort() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
		System.out.println();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::print);

	}

}
