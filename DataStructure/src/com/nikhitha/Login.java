package com.nikhitha;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		
		Scanner sc = new Scanner (System.in);
		
		
		int i=0;
		while(i<3) {
			
			
			
			System.out.println("Enter the username");
			String user= sc.nextLine();
			
			
			System.out.println("Enter the pass");
			String pass= sc.nextLine();
			
			
			
			if(user.equals("admin")&& pass.equals("12345")) {
				
				System.out.println("log in successfully");
				System.out.println("Welcome....!!! \t "+user);
				temp=1;
				break;
				
			}
			
			System.out.println("plz try again");
			i++;
			
		}
		
		
		if (temp==0)
		{
			
			System.out.println("plz contact admin");
			
		}
		
	}

}
