package com.exceptionassignments;

import java.util.Scanner;

public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // declare and initialize here.
            int a, b, c;
            Scanner KB = new Scanner(System.in);
            // input numbers here.
            System.out.print("Enter first number : ");
            a = KB.nextInt();
            System.out.print("Enter second number : ");
            b = KB.nextInt();
            //throw to catch
            c = a / b;
            System.out.println("Result:" + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero");
        }
	}

}
