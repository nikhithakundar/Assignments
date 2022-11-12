package com.nikhitha;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        
        

        System.out.print("Enter your income: ");
        double inc = sc.nextDouble();
        double tax;
        if( inc>=0 && inc<=180000)

        {
           System.out.println("slab A Nill");
        }
        else if((inc>180001)&&(inc<=300000))
        {
            tax = (inc * 10/100);
            System.out.println(" slab B 10%is"+tax);
        }
        
        else if((inc>300001)&&(inc<=500000))
        {
        	tax = (inc * 20/100);
            System.out.println(" slab C 20%is"+tax);
        }

        else if((inc>500001)&&(inc<=1000000))
        {
        	tax = (inc * 30/100);
            System.out.println(" slab D 30%is"+tax);
        }
        
	}

}
