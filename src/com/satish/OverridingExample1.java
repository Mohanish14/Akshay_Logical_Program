package com.satish;

public class OverridingExample1 extends OverridingExample2  {

	String s1="Akshay";
	int l;
	public String m1(){
		System.out.println("inside parent");
		return s1;
	}
	
	public Number m2(){
		
		return l;
	}

	public static void main(String[] args) {

		

	}

}
