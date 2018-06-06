package com.solve.problem;

import java.util.Scanner;

public class Solution16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String word = scan.next();

		try {

			Integer result = Integer.parseInt(word);
			System.out.println(result);
		} catch(NumberFormatException numFmExcp) {
			System.out.println("Bad String");
		}
	}
}
