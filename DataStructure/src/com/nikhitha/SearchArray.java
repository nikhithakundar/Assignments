package com.nikhitha;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,12,14,6,78,19,1,23,16,35,37,7,52,86,47};
		int temp=0;
		
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the number ");
	int c = sc.nextInt();
		
		
	
		for (int x: a) {
			if(x==c) {
				
				System.out.println("successfully search  " +x);
				temp =1;
				break;
			}
		
		}
	
		if (temp==0) {
			System.out.println("number not founded  " +c);
			
		}
		
	}

}
