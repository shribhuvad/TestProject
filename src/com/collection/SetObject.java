package com.collection;

import java.util.HashSet;
import java.util.Set;

class Bean {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	int a;
	int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

public class SetObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bean obj = new Bean();
		Bean obj2 = new Bean();

		obj.setA(10);
		obj.setB(11);

		obj2.setA(10);
		obj2.setB(11);
		// Bean s2=(Bean)obj.clone();

		Set<String[]> st = new HashSet<String[]>();
		st.add(args);
		// st.add("s"); it will give error

		Set a = new HashSet();
		boolean flag = a.add(obj);
		flag = a.add(obj2);
		System.out.println(a.size());
		System.out.println(flag);

	}

}
