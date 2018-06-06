package com.solve.problem;
import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=1; i<=10; i++) {

			int result = num*i;
			
			System.out.println(num + "x" + i + "=" + result);

			scan.close();
		}
	}

}
