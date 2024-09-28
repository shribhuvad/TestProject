package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListmodification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListmodification();
	}

	private static void arrayListmodification() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("sggs");
		list.add("csggs");
		list.add("sgcgs");
		list.add("sggxs");
		list.add("sggsw");

		Iterator<String> Iterator = list.iterator();

		ListIterator<String> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			listIterator.add("shri");
			/* Exception in thread "main" java.lang.OutOfMemoryError: Java heap space */
		}

		System.out.println("listIterator output :" + list);
		// Exception in thread "main" java.util.ConcurrentModificationException
//	     for (String string : list) {
//			list.add("dd");
//		}

		// it will not work Exception in thread "main" java.lang.OutOfMemoryError: Java
		// heap space
		for (int i = 0; i < list.size(); i++) {
			list.add("sggs");
		}

		// it work
//	     for(int i=0;i<5;i++)
//	     {
//	    	 list.add("sggs");
//	     }
//	     
		// it will work
		/*
		 * for(int i=0;i<list.size();i++) { list.remove("sggs"); }
		 */

		//
		while (Iterator.hasNext()) {
			System.out.println("inside loop");
			// System.out.println(list + "done");
			if (Iterator.next() == ("sggs")) {
				Iterator.remove();
			}
			// list.remove("sggs");// Exception in thread "main"
			// java.util.ConcurrentModificationException
			// list.remove(1);// Exception in thread "main"
			// java.util.ConcurrentModificationException
			// list.add("ss"); // Exception in thread "main"
			// java.util.ConcurrentModificationException

		}

		System.out.println(list + "done");

	}

}
