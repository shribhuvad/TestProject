package com.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapFunction {

	public static void main(String[] args) {
		HashMapFunction obj = new HashMapFunction();
		obj.show();
		obj.sameobjectAskey();
		// obj.normalHash();

	}

	private void normalHash() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// System.out.println(map.get("shri"));
		// System.out.println(map.get("shri")+1);
		System.out.println(map.put("shri", 1));
		System.out.println(map.put("shri", 2));
		System.out.println(map.put("shrini", 3));
		System.out.println(map.toString());
		System.out.println(map);

	}

	private void sameobjectAskey() {
		// TODO Auto-generated method stub
		Employee2 obj = new Employee2(1, "Shri");
		Employee2 obj2 = new Employee2(1, "Shri");
		Employee2 obj3 = new Employee2(3, "Shriw");
		HashMap<Employee2, String> map = new HashMap<Employee2, String>();
		map.put(obj, "shri");
		map.put(obj2, "shri2");
		map.put(obj3, "shri3");
		System.out.println(map.get(obj3));
		System.out.println(map.get(obj));
		System.out.println(map.get(obj2));
		System.out.println(map.size());

		for (Entry<Employee2, String> iterable_element : map.entrySet()) {
			System.out.println("---------------" + iterable_element.getKey() + "  " + iterable_element.getValue());
			System.out.println("------------");

		}

		List<Entry<Employee2, String>> list = map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee2::getName)))
				.collect(Collectors.toList());
		LinkedHashMap<Employee2, String> map2 = new LinkedHashMap<>();
		list.forEach(s -> {
			map2.put(s.getKey(), s.getValue());
		});

		System.out.println(map2);

	}

	void show() {
		Bin obj = new Bin(1);
		Bin obj2 = new Bin(2);
		Bin obj3 = new Bin(1);
		HashMap<Bin, String> map = new HashMap<Bin, String>();
		// map.put(obj, "shri");
		map.put(obj, "shri2");
		map.put(obj2, "shri");
		map.put(obj2, "shriiiii");

		System.out.println("geting objet3 " + map.get(obj3));
		System.out.println("geting objet2 " + map.get(obj2));
		System.out.println("geting objet " + map.get(obj));

		Set m = map.entrySet();

		System.out.println("iterating map");
		Iterator i = m.iterator();
		while (i.hasNext()) {

			Map.Entry<Bin, String> p = (Entry<Bin, String>) i.next();
			System.out.println(p.getKey() + "   " + p.getValue());

		}

		System.out.println(map.get(obj3));

	}

}

class Bin {
	int a;

	Bin(int s) {
		a = s;
	}

}
