package com.example.collection;

import java.util.ArrayList;
import java.util.List;


public class GenericMethodTest {
	// generic method printArray
	/*
	 * public static < E > void printArray( E[] inputArray ) { // Display array
	 * elements for ( E element : inputArray ){ System.out.printf( "%s ",
	 * element ); }
	 * 
	 * System.out.println(); }
	 */

	public static <E> void main(String args[]) {
		// Create arrays of Integer, Double and Character
		/*
		 * Integer[] intArray = { 1, 2, 3, 4, 5 }; Double[] doubleArray = { 1.1,
		 * 2.2, 3.3, 4.4 }; Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		 * 
		 * System.out.println( "Array integerArray contains:" ); printArray(
		 * intArray ); // pass an Integer array
		 * 
		 * System.out.println( "\nArray doubleArray contains:" ); printArray(
		 * doubleArray ); // pass a Double array
		 * 
		 * System.out.println( "\nArray characterArray contains:" ); printArray(
		 * charArray ); // pass a Character array
		 */

		/*
		 * List list=new ArrayList(); list.add(1);
		 */

		/*
		 * MyGen<Integer> m = new MyGen<Integer>();
		 * 
		 * m.add(2); m.add(1); // m.add("vivek");//Compile time error
		 * System.out.println(m.get()); MyGen<String> m1 = new MyGen<String>();
		 * 
		 * m1.add("sagar");
		 * 
		 * System.out.println(m1.get());
		 * 
		 * List<? extends Number> list=new ArrayList<Number>();
		 */
		
		List<Rectangle> list1=new ArrayList<Rectangle>();  
		list1.add(new Rectangle());  
		  
		List<Circle> list2=new ArrayList<Circle>();  
		list2.add(new Circle());  
		list2.add(new Circle());  
		  
	
	}
}