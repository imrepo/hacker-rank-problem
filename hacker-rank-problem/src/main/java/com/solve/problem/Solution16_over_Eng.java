package com.solve.problem;

import java.util.Scanner;

public class Solution16_over_Eng {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String word = scan.next();

		if (word.length()<=1 && word.length()>=6) {

			for(int i=0; i<word.length(); i++) {

				if(word.charAt(i)>=48 && word.charAt(i)<=57) {

					int result = Integer.parseInt(word);
					System.out.println(result);
				}if(word.charAt(i)>=97 && word.charAt(i)<=122) {
					System.out.println("Bad String");
				}
			}
		}
	}
}