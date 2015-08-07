package com.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.example.model.Employee;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("sagarkkkkkkkkkkkk", 2, 23));
		list.add(new Employee("badesSagar", 3, 23));
		list.add(new Employee("sagar", 2, 23));
		list.add(new Employee("sagar", 2, 23));
		list.add(4, new Employee("bade", 2, 23));
		System.out.println(list.contains(new Employee("bade", 1, 23)));
		System.out.println(list.get(4));

		List<Employee> list1 = new ArrayList<Employee>();
		list1.addAll(list);
		Iterator<Employee> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out
				.println("*****************************************************");
		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(new Employee("sagarkkkkkkkkkkkk", 2, 23));
		list2.add(new Employee("badesSagar", 3, 23));
		list2.add(new Employee("sagar", 2, 23));
		list2.add(new Employee("sagar", 2, 23));
		list2.add(4, new Employee("bade", 2, 23));
		System.out.println(list.equals(list2));
		
		Iterator<Employee> itr1 = list2.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out
				.println("*****************************************************");

		List<Employee> list3 = new LinkedList<Employee>();
		list3.add(new Employee("sagarkkkkkkkkkkkk", 2, 23));
		list3.add(new Employee("badesSagar", 3, 23));
		list3.add(new Employee("sagar", 2, 23));
		list3.add(new Employee("sagar", 2, 23));
		list3.add(4, new Employee("bade", 2, 23));

		Iterator<Employee> itr2 = list3.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out
				.println("*****************************************************");
	}

}
