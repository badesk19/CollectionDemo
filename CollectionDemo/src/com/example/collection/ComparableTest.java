package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.example.model.Employee;

public class ComparableTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("sagarkkkkkkkkkkkk", 10, 23));
		list.add(new Employee("sagar", 0, 23));
		list.add(new Employee("sagar1", 2, 23));
		list.add(new Employee("badesSagar", 3, 23));
		
		Collections.sort(list);
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
