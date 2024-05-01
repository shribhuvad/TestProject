package com.core;

public class UnreachebleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		UnreachebleCode a = new UnreachebleCode();
		int c = a.show(i);
		System.out.println("******" + c);
	}

	@SuppressWarnings("finally")
	int show(int i) {
		i = 2;
		try {
			i = 31;
			i = i / 0;
			return i;
			//System.exit(0);
		} 
		catch (NullPointerException e) {
			System.out.println("in catch");
			return i;
		} catch (Exception e) {
			System.out.println("in catch");
			return i;
		} 
		finally {
			i = 4;
			System.out.println("in finally"+i);
		return i;
		}
//		 System.out.println(i);
//		 i=5;
//		 return i;
	}

}
