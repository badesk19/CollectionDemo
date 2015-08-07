package com.example.collection;

import java.util.Comparator;

import com.example.model.Book;

public class ComparatorByName implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		Book b1 = (Book) arg0;
		Book b2 = (Book) arg1;
		return b1.getName().compareTo(b2.getName());
	}

}
