package com.core.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {

		Employee obj=new Employee(1,"Shri");
		Employee obj2=new Employee(2,"Test");
		
		
		HashMap<String,Employee> map=new HashMap<>();
		map.put("a", obj);
		map.put("b", obj2);
		
	//System.out.println(map.get("b"));
	
	List<Employee> list=new ArrayList<>();
	list.add(obj);
	list.add(obj2);
	
	Optional<Employee> empOptional= list.stream().filter(s->s.getName().equals("Shri")).findFirst();
	
	empOptional.ifPresent(s->{System.out.println(s);});



		
	}

}

class Employee {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;

		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
