package com.wraperDemo;

public class InheritanceDemo {
//public	int i=10;
//public	int j=25;
//public	int k;
	public static void main(String[] args) {
		
	//Sample s=new Sample();
	//s.Add();
	
	//P a=new P();
//a.Ad();
//a.Add();
Sample c=new P();
c.Add();

	
	
		
	}

}
 class Sample{
	 
int i=12;
int j=5;
int k;
	public void Add() {
		 k=i+j;
	System.out.println("add"+k);
	
	}

	}
	class P extends Sample{
		public void Ad() {
			k=i-j;
			
			System.out.println("ad"+k);
		}
	}
	 
 