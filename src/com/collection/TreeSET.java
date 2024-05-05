package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSET {

	public static void main(String[] args) {
		//Allow any type of element
		ArrayList c=new ArrayList();
		c.add("ss");
		c.add(1);
		
		
		//At run time it will give error 
		//Excepti  on in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
/*		TreeSet a2=new TreeSet();
		a2.add("shri");
		a2.add(1);
		System.out.println(a2);*/
		
//
		//it will work
		Set a=new HashSet();
		a.add("shri");
		a.add(1);
		System.out.println("Printing set"+a);		
		
		TreeSet<Employee> obj=new TreeSet<Employee>();
		Employee e1=new Employee(1,"shri");
		Employee e2=new Employee(1,"bhuvad");
		obj.add(e1);
		obj.add(e2);
		System.out.println("Printing Treeset");		

		Iterator<Employee> itr=obj.iterator();
		while(itr.hasNext())
		{
			Employee ob=itr.next();
			System.out.println(ob);
		}
		
		
		System.out.println("HashSet--------------");
		Set<Employee2> st=new HashSet<Employee2>();
		Employee2 obj1=new Employee2(1,"shri");
		Employee2 obj2=new Employee2(1,"bhuvad");
		st.add(obj1);
		st.add(obj2);
		Iterator<Employee2> itr1=st.iterator();
		while(itr1.hasNext())
		{
			Employee2 ob2=itr1.next();
			System.out.println(ob2);
		}
		
		
	}

}

class Employee2 
{
	int iD;
    String name;
    Employee2(int id,String name)
    {
    	this.iD=id;
    	this.name=name;
    }
	@Override
	public String toString() {
		return "Employee2 [iD=" + iD + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(iD, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		return iD == other.iD && Objects.equals(name, other.name);
	}


	
}
	


class Employee implements Comparable<Employee>
{
	int iD;
    String name;
    Employee(int id,String name)
    {
    	this.iD=id;
    	this.name=name;
    }
	


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.iD>o.iD)
		return 1;
		if(this.iD==o.iD)
			return 0;
		else return -1;
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iD;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (iD != other.iD)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [iD=" + iD + ", name=" + name + "]";
	}
	
	
	}

