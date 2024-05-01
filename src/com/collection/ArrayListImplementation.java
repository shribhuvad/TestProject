package com.collection;
import java.util.Arrays;

public class ArrayListImplementation {
	Object mylist[] ;//= new Object[10];
	int size = 0;
    int increamentaSize=0;
	void add(Object obj) {
		increamentaSize++;
		if (size==0)
		{
			mylist=new Object[2];
		}
		if (mylist.length<=increamentaSize)
		{
			mylist=Arrays.copyOf(mylist, increamentaSize*2);
		}
		mylist[size++] = obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListImplementation obj = new ArrayListImplementation();
		obj.add("shri");
		obj.add(1);
		obj.add("shri");
		obj.add(1);
		 System.out.println(Arrays.toString(obj.mylist));
		
		 

	}

}
