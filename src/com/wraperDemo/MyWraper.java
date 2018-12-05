package com.wraperDemo;

public class MyWraper {
	public static void main(String[] args) {
		int c=56564658;
		long s=(long)c;// value of int //implicit casting
		
		
		//Character i=Character.valueOf('b');//converting value of int into Integer
		System.out.println("s"   +s);
		//Integer j=b;//autoboxing now compiler will write intger.valuef(a)internaly
			
		//System.out.println("j"+j);
		
	    int a=20;//value of Integer that is a primitives
	     byte k=(byte) a;//explicit casting
		System.out.println("a"+a);
		
		
		
		
		
	}

}
//primitive Type         int       boolen     char         byte      short     long    float     double
 
//*** Wraper Class       Integer   Boolean     Character   Byte      Short     Long     Float     Double
  
// *** implicit casting---upcasting----byte->Short->Long etc...take increasing order of data type

//**   Explicite casting---DowmCasting--long->int etc