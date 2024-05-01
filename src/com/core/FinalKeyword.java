package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list =new ArrayList<Integer> ();
		list.add(2);
		List a=Collections.unmodifiableList(list);
		//a.add(3);
		//list =new ArrayList<Integer> (); it will give error
		System.out.println(a);
		
		final String s="as";
		//s="shri";
		
		final StringBuffer st=new StringBuffer();
		st.append("shri");
		
	//	st=new StringBuffer();    
		
		System.out.println(st);
		

		
	}

}
