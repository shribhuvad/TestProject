package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronize {

	public static void main(String[] args) {
		// hashmapModification();
		hashmapModification2();
		// hashmapModification3();
		// TODO Auto-generated method stub

	}

	private static void hashmapModification3() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// ConcurrentHashMap<Integer,String> map = new
		// ConcurrentHashMap<Integer,String>();
		map.put(1, "shri");
		map.put(2, "shri");
		map.put(3, "shriBhuvad");

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

		// This will work
		for (int i = 0; i < map.size(); i++) {
			map.remove(1);
			map.put(4, "shri4");
		}

		while (iterator.hasNext()) {

			System.out.println("add");
			Map.Entry<Integer, String> entry = iterator.next();
			// if (entry.getKey() == 1)
			{
				map.put(3, "ddd");
//			 map.remove(1);
				// For both Exception in thread "main" java.util.ConcurrentModificationException

				// iterator.remove();//its work it will remove

			}
			System.out.println("in iterator while loop1");
		}
		System.out.println("final MAP :" + map);

	}

	private static void hashmapModification2() {
		// HashMap<Integer, String> map = new HashMap<Integer, String>();
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(1, "shri");
		map.put(2, "shri");
		map.put(3, "shriBhuvad");
		// for all Exception in thread "main" java.util.ConcurrentModificationException
		for (Map.Entry m2 : map.entrySet()) {
			map.remove(1);
			map.put(4, "ddd");

			if (m2.getKey().equals(1)) {
				// map.remove(1);//Exception in thread "main"
				// java.util.ConcurrentModificationException
			}
		}

		System.out.println("final MAP :" + map);
	}

	private static void hashmapModification() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// ConcurrentHashMap<Integer,String> map = new
		// ConcurrentHashMap<Integer,String>();
		map.put(1, "shri");
		map.put(2, "shri");
		map.put(3, "shriBhuvad");
		System.out.println(map + " Map ---");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			System.out.println("in iterator while loop");// we dont do iterator.next() it will not terminate
			iterator.next();
			iterator.remove();

		}

		System.out.println(map + "Map last ");

		// TODO Auto-generated method stub

	}

}
