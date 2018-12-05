package com.wraperDemo;


public class BoxingAutoboxingDemo {
	public static void main(String[] args) {
		
	
	
	//byte data type
	byte a=1;
	//wrapping arround byte object
	Byte b=new Byte(a);
	
	int i=23;
	//wrapping arount int object
	
	Integer y=new Integer(i);
	System.out.println("y"+y);
	System.out.println("a "+b);
	
	//unwrapping objects to primitive data type
	byte bv=b;
	System.out.println("bv"+bv);
	}	
}



