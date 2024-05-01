package com.collection;
import java.util.ArrayList;
import java.util.List;

public class CollectionEqualMethode {

	public static void main(String[] args) {
		
		List one=new ArrayList<>();
		one.add(1);
		one.add(2);
		
		List two=new ArrayList<>();
		//two.add(1);
		two.add(2);
		two.add(1);//This will give result false
		
		System.out.println(one.equals(two));
		
		// TODO Auto-generated method stub

	}

}
