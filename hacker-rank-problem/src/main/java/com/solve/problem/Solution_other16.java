package com.solve.problem;

import java.util.Scanner;

public class Solution_other16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String ch = scan.next();

		char [] ch1 = ch.toCharArray();

		for(int i =0; i<ch1.length-1; i++) {
			if(ch1[i]>=48 && ch1[i]<=57) {
				String finalResult = String.copyValueOf(ch1);
				int result = Integer.parseInt(finalResult);
				System.out.println(result);
			}

			if(ch1[i]>=97 && ch1[i]<=122) {
				try {
					String finalResult = String.copyValueOf(ch1);
					int result = Integer.parseInt(finalResult);
					System.out.println(result);
				} catch (NumberFormatException e) {
					System.out.println("Bad String");
				}
			}
			
			scan.close();
		}
	}
}
