package com.core;

interface inta
{
	void show();
	int a=1;
	
	}
interface intb extends inta
{
	void show();
	int a=0;
	
	}


public class Interfaces implements inta,intb{

	public static void main(String[] args) {
  		// TODO Auto-generated method stub
		Interfaces obj=new Interfaces();
		//int a=obj.a;  The field obj.a is ambiguous
		
		inta obj2=new Interfaces();
		int a=obj2.a;
		System.out.println(a);
		
		
		intb obj3=new Interfaces();
		a=obj3.a;
		System.out.println(a);
		
		
  
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
