package com.wraperDemo;

public class Methodoverriding {
	public static void main(String[] args) {
		N p=new N();
		p.M();
		p.Add();
		
	}

}
class N{
	public int i=5;
	public int j=10;
	public int k;
	
	public void Parrent() {
		System.out.println("Parent method");
	}
	public void M() {
		System.out.println("method1");
	}
	//public void M() {
		
	//}
	public void Add() {
		k=i+j;
		System.out.println("add"+k);
		
	}
	
}
class V extends N{
	public void M() {
		System.out.println("override");
	}
	public void Add() {
		k=j-i;
		System.out.println("subtraction"+k);
	}
	
}
