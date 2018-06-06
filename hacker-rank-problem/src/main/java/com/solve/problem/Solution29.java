package com.solve.problem;

import java.util.Scanner;

public class Solution29 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int k=0; k<T; k++) {
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			
			int max = 0;
			
			for(int i=1; i < N; i++) {
				for(int j = i+1; j<=N; j++) {
					int h = i & j;
					if(h<j && max<h) max =h;
					
				}
			}
			System.out.println(max);
		}
	}

	
}
