package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.example.model.Book;

public class ComparatorTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Set<Book> emp2 = new HashSet<Book>();
		emp2.add(new Book("cpp", "z"));
		emp2.add(new Book("c", "y"));
		emp2.add(new Book("kava", "ac"));
		emp2.add(new Book("aava", "x"));

		List<Book> list = new ArrayList<Book>();
		list.addAll(emp2);
		/*
		 * list.add(new Book("cpp", "z")); list.add(new Book("c", "y"));
		 * list.add(new Book("kava", "ac")); list.add(new Book("java", "x"));
		 */
		Collections.sort(list, new ComparatorByName());
		Iterator<Book> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list, new ComparatorByAuthor());
		Iterator<Book> itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
