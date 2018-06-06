package com.solve.problem;

import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = facto(n);
		System.out.println(result);
	}

	private static int facto(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*facto(n-1);
		}
	}
}
