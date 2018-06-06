package com.solve.problem;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		//String even = null;
		//String odd = null;
		scan.nextLine();

		for(int i=0; i<N; i++) {

			String string = scan.nextLine();

			char[] ch = string.toCharArray();

			for(int j=0; j<ch.length; j++) {
				if(j%2==0) {
					System.out.print(ch[j]);
				}
			}

			System.out.print(" ");

			for(int j=0; j<ch.length; j++) {

				if(j%2!=0) {
					System.out.print(ch[j]);
				}
			}

			System.out.println();
		}

	}
}
