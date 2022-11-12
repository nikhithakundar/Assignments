package com.nikhitha;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the price  ");
	    double p = sc.nextDouble();

	    System.out.print("Enter the rate ");
	    double rate = sc.nextDouble();

	    System.out.print("Enter the time ");
	    double time = sc.nextDouble();

	    System.out.print("enter the time period ");
	    double n = sc.nextDouble();
	    
	    
	    
	    
	    double interest = (p * time * rate) / 100;
	    System.out.println("Simple Interest "+interest);
	    double amount = p * Math.pow(1 + (rate / n), n * time);
       // double cinterest = amount - p;
        System.out.println("Compound Interest "+amount);

	 
	  
	}


}
