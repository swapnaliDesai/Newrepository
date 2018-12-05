package com.wraperDemo;

public class ThisSuperDemo {
	
	
	public static void main(String[] args) {
		ThisSuperDemo t=new ThisSuperDemo();
		A a=new A();	
		a.M1();
		//Z z=new Z();
		//z.M1();
		//z.M2();
			
	}

}
	
	 class A{  	
			
	
	
	public void M1() {
		
		System.out.println("inside m1");
		
	
	}	
		
	 }
	
	  class Z extends A{
		
		  public void M2() {
				
				System.out.println("f");
				
				
			}
				
		
		
	}


//*** if u declared static chield class then only execute ur main method


