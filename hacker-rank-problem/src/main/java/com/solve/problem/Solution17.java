package com.solve.problem;

import java.util.Scanner;

class Solution17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int testcases = scan.nextInt();

		while (testcases-- > 0) {

			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			Calculator calc = new Calculator();
			try {
				int ans = calc.power(num1, num2);
				System.out.println(ans);
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		scan.close();
	}
}
