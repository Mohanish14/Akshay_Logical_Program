package com.satish;

public class FirstLatterCapital {

	public static void main(String[] args) {

		String str="akshay rajkumar chidre";
		char sp[]=str.toCharArray();
		
		sp[0] =(char)(sp[0]-32);
		for(int i=0;i<sp.length;i++){
			
			if(sp[i] ==' '){
				
				sp[i]=(char) (sp[i+1]-32);
			}
		}
System.out.println(sp);
	}

}
