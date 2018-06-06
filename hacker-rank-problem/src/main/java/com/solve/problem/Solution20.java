package com.solve.problem;

import java.util.Scanner;

public class Solution20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] a = new int[n];

		for(int i =0; i<n; i++) {

			a[i] = scan.nextInt();

		}
		int numSwaps = 0;
		for(int j =0; j<n; j++) {

			for(int k =0; k<n-1; k++) {
				if(a[k]>a[k+1]) {
					int temp = a[k];
					a[k] = a[k+1];
					a[k+1] = temp;
					numSwaps++;
				}

			}
			if (numSwaps == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + numSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
	}
}
