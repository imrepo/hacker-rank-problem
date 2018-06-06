package com.solve.problem;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int [] array = new int[N];
		
		for (int i=0; i<N; i++) {
			
			array[i] = scan.nextInt();
		}	
			for(int j = array.length-1; j>=0; j--) {
				
				System.out.print(array[j] + " ");
			}
		}
	}
