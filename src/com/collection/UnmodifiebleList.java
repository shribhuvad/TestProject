package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//28-May-2024
public class UnmodifiebleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
	//	unmodifiableList = new ArrayList<>();
	//	unmodifiableList.add(3); // it will give error
		list = new ArrayList<Integer>();
		System.out.println(unmodifiableList);
		List<String> lista = Arrays.asList("See", "dd");
		lista.add("Shri");
		System.out.println(lista);

	}
}
