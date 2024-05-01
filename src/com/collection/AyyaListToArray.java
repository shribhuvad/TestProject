package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AyyaListToArray {

	public static void main(String[] args) {

		List<String> llst = new LinkedList<String>();
		llst.add("shr");
		String s = llst.get(0);

		ArrayList<String> lst = new ArrayList<String>();
		lst.add("shri");
		lst.add("s");
		String[] ayyay = lst.toArray(new String[lst.size()]);
//String[] ayyay2=(String[]) lst.toArray();	//Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;


//System.out.println(ayyay2);

		List<String> l2 = new ArrayList<>();
		l2 = Arrays.asList(ayyay);

		// TODO Auto-generated method stub

	}

}
