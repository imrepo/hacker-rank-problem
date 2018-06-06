package com.solve.problem;

import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {

		int binary =0;
		int maximumConsecutive=0;

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		while (num > 0) {

			if(num%2 == 1) {
				binary++;

				if(binary>maximumConsecutive) {
					maximumConsecutive = binary;
				}
			} else {
				binary=0;
			}
			num = num/2;

		}
		System.out.println(maximumConsecutive);
	}
}
