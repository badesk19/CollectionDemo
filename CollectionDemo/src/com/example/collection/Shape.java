package com.example.collection;

import java.util.*;  
abstract class Shape{  
abstract void draw(); 

}  
class Rectangle extends Shape{ 
	
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
  
  
class GenericTest{  
//creating a method that accepts only child class of Shape  
public static void drawShapes(List<? extends Shape> lists){  
for(Shape s:lists){  
s.draw();//calling method of Shape class by child class instance  
}  
}  
}  