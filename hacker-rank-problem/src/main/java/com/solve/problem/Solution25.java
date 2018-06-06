package com.solve.problem;

import java.util.Scanner;

public class Solution25 {

	public static boolean isPrime(int num) {
		for(int i=2; i<Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
			int number = sc.nextInt();


			if(number>=2 && isPrime(number) ) {
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		}

	}
}
