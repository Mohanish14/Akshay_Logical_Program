package com.satish;

 class P {
	 //Integer a=new Integer(10);
	 Object o=new Object();
	  public  Object m1(){
	   return o;
	  }
	
	}
 public class Q extends P{
		int i;

	 
	   public static void main(String[] args){
		   
		   P a=new Q();
		   a.m1();
		  }
	   
	//   a.m3();
	}