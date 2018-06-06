package com.solve.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		Map<String, Integer> mapValue  = new HashMap<String, Integer>(); 
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		for(int i=0; i<N; i++) {
			String name = scan.next();
			int phone = scan.nextInt();
			mapValue.put(name, phone);
		}

		while(scan.hasNext()) {
			String s = scan.next();
			if(mapValue.containsKey(s)) {
				int phone = mapValue.get(s);
				System.out.println(s + "=" + phone);
			} else System.out.println("Not found");
		}
		
		scan.close();
	}
}
