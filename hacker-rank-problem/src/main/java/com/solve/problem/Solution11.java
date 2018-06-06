package com.solve.problem;

import java.util.Scanner;

/*
 * 
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0 

 1 1 1 
 0 1 0
 1 1 1

 */
public class Solution11 {

	public static void main(String[] args) {

		int maxValue = Integer.MIN_VALUE;

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[6][6];

		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j] = scan.nextInt(); 

			}
		}
		for(int i=0; i<=3; i++) {
			for (int j=0; j<=3; j++) {
				
				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

				if(maxValue<sum) {
					maxValue=sum;
				}
			}
		}
		System.out.println(maxValue);
	}

}
