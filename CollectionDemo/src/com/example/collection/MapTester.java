package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Set;
import java.util.TreeMap;

import com.example.model.Book;

public class MapTester {
	public static void main(String[] args) {
		/*
		 * Map<String, Book> map = new HashMap<String, Book>(); Book b2 = new
		 * Book("a3", "assy"); Book b0 = new Book("a3", "assy"); Book b1 = new
		 * Book("a", "z"); Book b3 = new Book("a", "z"); map.put(null, b2);
		 * map.put("hello", b3); map.put("hi", b0); map.put("hello", b1);
		 * System.out.println(map.containsKey("hi"));
		 * System.out.println(map.containsValue(b1)); Set<Map.Entry<String,
		 * Book>> entry = map.entrySet();
		 * 
		 * for (Map.Entry<String, Book> me : entry) {
		 * System.out.print(me.getKey() + ": ");
		 * 
		 * }
		 */

		/* System.out.println(map); */

		/*
		 * Map<String, Book> map1 = new LinkedHashMap<String, Book>(); Book b4 =
		 * new Book("3Ea", "assy"); Book b5 = new Book("1v", "z"); Book b6 = new
		 * Book("a", "z"); map1.put(b5.getName(), b5); map1.put(null, b4);
		 * map1.put(b6.getName(), b6); System.out.println(map1);
		 */

		Map<Integer, Book> map2 = new TreeMap<Integer, Book>();
		Book b10 = new Book("11", "assy");
		Book b7 = new Book("11", "assy");
		Book b8 = new Book("8", "z");
		Book b9 = new Book("9", "z");
		map2.put(4, b7);
		map2.put(6, b8);
		map2.put(1, b9);
		map2.put(9, b9);
		map2.put(9, b10);
		System.out.println(map2);

	}
}
