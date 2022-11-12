package com.nikhitha;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		for(num=100;num<=1000;num++)
		
		{	
		
		int n,count=0;
		double sum=0;
		
		int temp  = num;
		
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
			
			System.out.println("amstrong number "+sum);
		}
		

	}

	}}
