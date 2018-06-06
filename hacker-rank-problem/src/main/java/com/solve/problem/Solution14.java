package com.solve.problem;

import java.util.Scanner;

public class Solution14 {
	
	private int[] elements;
	public int maximumDifference;

	public Solution14(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {

		int maximum =0;
		for(int j=0; j<elements.length; j++) {

			for(int k=0; k<elements.length; k++) {

				int sub = Math.abs(elements[j] - elements[k]);

				if(sub>maximum) {
					maximum = sub;
				}

			}

			maximumDifference = maximum;
		}
	}

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Solution14 difference = new Solution14(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	    }
}