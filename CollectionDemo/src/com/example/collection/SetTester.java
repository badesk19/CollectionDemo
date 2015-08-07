package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.example.model.Employee;

public class SetTester {

	public static void main(String args[]) {
/*
		Set<Employee> emp1 = new HashSet<Employee>();
		emp1.add(new Employee("Sagar", 44, 23));
		emp1.add(new Employee("Sagar", 1, 231));
		emp1.add(new Employee("Sagar", 1, 23));
		System.out.println(emp1);
		
		Set<Employee> emp2 = new HashSet<Employee>();
		emp2.add(new Employee("Sagar", 1, 2));
		System.out.println(emp1.equals(emp2));
*/
		Set<String> set = new LinkedHashSet<String>();
		set.add("1");
		set.add("sagar");
		set.add("bade");
		set.add("sagar");
		set.add("bade1");

/*		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<String> set1 = new TreeSet<String>();
		set1.add("hi");
		set1.add("bade");
		set1.add("sagar");
		set1.add("a");

		Iterator<String> itr1 = set1.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	*/	
		Set<Employee> set2=new TreeSet<Employee>();
		set2.add(new Employee("sagar",8,249));
		set2.add(new Employee("weqewqbade",3,24));
		set2.add(new Employee("za",1,29));
		set2.add(new Employee("asdasdasdasdasdf",5,23));
		Iterator<Employee> itr2 = set2.iterator();

	/*	while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}*/
		
		for(Employee e:set2)
		{
			System.out.println(e);
			
		}
		

	}

}
