package com.wraperDemo;
public class AbstractClass {
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
 
	//	AbstractClass obj=new AbstractClass();
		B b=new B();
		Abstractdemo A=b;
	//	b.AbstractMethod();
		A.AbstractMethod();
		b.M1();
		B.M();
		B.z();
	//Abstractdemo o=new Abstractdemo(); 
		
		}
	}



	abstract class Abstractdemo{
		abstract void AbstractMethod();
		static void z() {
			System.out.println("inside S");
		}
		
	}
class B extends Abstractdemo{
	void AbstractMethod(){
		System.out.println("abstract method implementation");
		
	}
	public void M1() {
		System.out.println("inside simple ethod");
	}
	static void M() {
		System.out.println("inside static method");
	
	}
	
}


/*** we can not create object of abstract class** */
/* we can create object of only sub classes of abstract class*/
/*in above program B is a subclass of abstract class so we can create obj of B*/
/**abstract method cant be static*/
/*
 * but u can create static method inside the abstract class*/
 