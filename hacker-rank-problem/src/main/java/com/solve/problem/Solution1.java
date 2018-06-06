package com.solve.problem;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int array1 [] = new int[6];

		int i=0 , j=0;

		for ( i=0; i<=array1.length-1; i++) {

			array1[i] = scan.nextInt();
			
			if(array1[i] == array1[i+1]) {
				System.out.println("");
			}else
				System.out.println(1);
		}

		/*for( j=0; j<array2.length-1; j++) {

			array2[j] = scan.nextInt();

		}*/

		/*if(array1[i] == array2[j]) {
			System.out.println("");
		}else {
			System.out.print(1 + " ");
		}*/
	}

}
