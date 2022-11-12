package com.lambdaassignment;
interface A1{
	int Operation(int a,int b);
}
public class Lambda1 {

	public static void main(String[] args) {
		
		
		A1 a1=(a,b)->(a+b);
		System.out.println("Addition  : "+a1.Operation(10,20));
		
		A1 a2=(a,b)->(a-b);
		System.out.println("Substraction : " +a2.Operation(50,20));
		
		A1 a3=(a,b)->(a*b);
		System.out.println("Multiplication  : "+a3.Operation(5,2));
		
		A1 a4=(a,b)->(a/b);
		System.out.println("Division  : "+a4.Operation(50,10));
		
	}

}
