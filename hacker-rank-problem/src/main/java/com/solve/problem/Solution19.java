package com.solve.problem;

public class Solution19 implements AdvancedArithmetic{

	
	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int result = sol.divisorSum(5);
		System.out.println(result);
	}

	public  int divisorSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) 
				sum =+ i;
		}
		return sum;
	}
}
