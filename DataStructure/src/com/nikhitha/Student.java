package com.nikhitha;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first subject marks");
		int m1 = sc.nextInt();
		
		
		System.out.println("Enter the second subject marks");
		int m2 = sc.nextInt();
		
		System.out.println("Enter the Third subject marks");
		int m3 = sc.nextInt();

		if(m1>=60 && m2>=60 && m3>=60)
		{
			System.out.println("passed");	
		}	
		
		
		else if((m1>=60 && m2>=60 && m3<=60)||(m1>=60 && m3>=60 && m2<=60) || (m2>=60 && m3>=60 && m1<=60) )
		{
			System.out.println("promoted");	
		}	
		

		else if((m1>=60 && m2<=60 && m3<=60)||(m2>=60 && m1<=60 && m3<=60) || (m3>=60 && m2<=60 && m1<=60) )
		{
			System.out.println("failed");	
		}	
		
		else {
			
			System.out.println("failed");
		}
		
	}

}
