package com.solve.problem;

import java.util.Scanner;

public class Airthmatic {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        
	        double tip = (mealCost * tipPercent/100);
	        
	        double tax = (mealCost * taxPercent/100);
	        
	        double finalAmmount = (mealCost + tip + tax);
	        
	        
	        
	        scan.close();
	      
	        
	        // Write your calculation code here.
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(finalAmmount);
	        
	        System.out.println("The total meal cost is " + totalCost + " dollars.");
	      
	        // Print your result
	    }
	}

