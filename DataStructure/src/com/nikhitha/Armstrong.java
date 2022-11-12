package com.nikhitha;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int n,count=0;
		double sum=0;
		
		int temp=num;
		
		while(num>0) {

			count=count+1;
			num=num/10;
		}

		num=temp;

		while(temp>0)
		{
		n=temp%10;;
	
		sum=sum+(Math.pow(n, count));
			temp=temp/10;
	
		}	
		
		if(num==sum) {
			
			System.out.println("given number is amstrong");
		}
		else {
			
			System.out.println("given number not amstrong");
		}

	}

}
