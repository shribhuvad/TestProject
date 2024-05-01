package com.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronize {

	public static void main(String[] args) {

		hashmapModification();
		//arrayListmodification();
		// TODO Auto-generated method stub

	}

	private static void arrayListmodification() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("sggs");
		list.add("csggs");
		list.add("sgcgs");
		list.add("sggxs");
		list.add("sggsw");
		
		Iterator<String> listIterator = list.iterator();

		// Exception in thread "main" java.util.ConcurrentModificationException
//	     for (String string : list) {
//			list.add("dd");
//		}


		// it will not work Exception in thread "main" java.lang.OutOfMemoryError: Java
		// heap space
//	     for(int i=0;i<list.size();i++)
//	     {
//	    	 list.add("sggs");
//	     }

		// it work
//	     for(int i=0;i<5;i++)
//	     {
//	    	 list.add("sggs");
//	     }
//	     
		// it will work
/*	     for(int i=0;i<list.size();i++)
	     {
	    	 list.remove("sggs");
	     }*/

		// 
	     while(listIterator.hasNext())
	     {
	    	 System.out.println("inside loop");
	    	 // System.out.println(list + "done");
	    	 if(listIterator.next()==("sggs"))
	    	 {
	    		 listIterator.remove(); 
	    	 }
	          //list.remove("sggs");// Exception in thread "main" java.util.ConcurrentModificationException
	          //list.remove(1);// Exception in thread "main" java.util.ConcurrentModificationException
	         //list.add("ss");     // Exception in thread "main" java.util.ConcurrentModificationException
	    	 
	     }

		System.out.println(list + "done");

	}

	private static void hashmapModification() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// ConcurrentHashMap<Integer,String> map = new
		// ConcurrentHashMap<Integer,String>();
		map.put(1, "shri");
		map.put(2, "shri");
		map.put(3, "shriBhuvad");

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

		
		//This will work
		for(int i=0;i<map.size();i++)
	     {
	    	 map.remove(1);
	    	 map.put(4, "shri4");
	     }
		 System.out.println("first loop complete");
		
		while (iterator.hasNext()) {

			
			 System.out.println("add");
			 Map.Entry<Integer, String> entry = iterator.next();
		//	if (entry.getKey() == 1) 
			{
//				 map.put(3, "ddd");
//				 map.remove(1);
				// For both Exception in thread "main" java.util.ConcurrentModificationException

				//iterator.remove();//its work it will remove
				 
			}
			System.out.println("in iterator while loop1");
		}
		System.out.println(map + "Map ---");

	while (iterator.hasNext()) {
			System.out.println("in iterator while loop");//as we dont do iterator.next() it will not terminate
			iterator.next();
			 iterator.remove();//this will give error
			break;

		}

		System.out.println(map);
		// for all Exception in thread "main" java.util.ConcurrentModificationException
		for (Map.Entry m2 : map.entrySet()) {
			// map.remove(1);
			// map.put(3, "ddd");
			
			if (m2.getKey().equals(1))
			{
				//map.remove(1);//Exception in thread "main" java.util.ConcurrentModificationException
			}
		}

		System.out.println(map + "Map last ");

		// TODO Auto-generated method stub

	}

}
