package com.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolarisQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> list=Arrays.asList('a','a','s','x','z','a','s');
		List<Character> list2=new ArrayList<>();
		List<Character> list3=new ArrayList<>();

		for (Character character : list) {
			
			if (!list2.contains(character))
			{
				list2.add(character);
			}
			else if (!list3.contains(character))
			{
				list2.remove(character);
				list3.add(character);
			}
			
		}
		
		System.out.println(list2.toString());
		System.out.println(list3.toString());
		
		

	}

}
  