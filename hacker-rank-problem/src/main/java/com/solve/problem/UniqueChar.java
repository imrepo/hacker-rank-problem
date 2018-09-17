package com.learn.java8;

public class UniqueChar {

	public static void main(String[] args) {
	 UniqueChar charOb = new UniqueChar();	
	  System.out.println(charOb.getUnique("KALAM"));
	}
	
	public boolean getUnique(String str){

		boolean result = false;
		for(char ch : str.toCharArray()) {
			if(str.indexOf(ch) == str.lastIndexOf(ch) ){
				result = true;
			}else{
				result = false;
				break;
			}
		}
		return result;
	}
}
