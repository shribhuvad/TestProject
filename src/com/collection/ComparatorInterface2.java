package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student2 {
	int rollno;
	String name;
	int age;

	Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}


class NameComparator implements Comparator<Student2> {
	public int compare(Student2 s1, Student2 s2) {
		return s1.name.compareTo(s2.name);
	}
}



class AgeComparator implements Comparator<Student2> {
	public int compare(Student2 s1, Student2 s2) {
		return 1;
		/*if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;*/
	}
}

public class ComparatorInterface2 {

	public static void main(String args[]) {

		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(101, "Vaa", 23));
		al.add(new Student2(106, "Ajay", 27));
		al.add(new Student2(105, "Jai", 21));
		System.out.println("Sorting by Name...");
		Collections.sort(al, new NameComparator());
		
		for (Student2 st : al)
		{
		  System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		for (Student2 st : al) 
		{
		  System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
