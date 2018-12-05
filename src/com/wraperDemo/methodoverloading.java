package com.wraperDemo;

public class methodoverloading {
	public static void main(String[] args) {
		D d=new D();
		d.M(2);
		F h=new F();
		h.M(0.0);
		
	}

}
class D{
	public void M(int i) {
		System.out.println(i);
	}
	public void M(String s) {
		System.out.println("s");
	}
	
}
class F extends D{
	public void M(double f) {
		System.out.println(f);
		
	}
}
