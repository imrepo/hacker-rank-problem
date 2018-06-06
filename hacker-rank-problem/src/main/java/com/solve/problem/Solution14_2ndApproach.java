package com.solve.problem;

import java.util.Scanner;

public class Solution14_2ndApproach {

	public static void main(String[] args) {
		int[] elements;

		int maximumDifference = 0;

		Scanner scan = new Scanner(System.in);

		int arrSize = scan.nextInt();

		int [] elemrntsAfterSub = new int[arrSize];

		elements = new int[arrSize];

		for(int i=0; i<elements.length; i++) {

			elements[i] = scan.nextInt();
		}

		for(int j=0; j<elements.length-1; j++) {

			for(int k=j+1; k<elements.length; k++) {

				elemrntsAfterSub[j] = Math.abs(elements[j] - elements[k]);
			}

			maximumDifference = elemrntsAfterSub[0];
			for(int i=0; i<elemrntsAfterSub.length; i++) {
				if(elemrntsAfterSub[i]>maximumDifference) {
					maximumDifference = elemrntsAfterSub[i];
				}
			}
		}

		System.out.println(maximumDifference);
		scan.close();
	}

}
