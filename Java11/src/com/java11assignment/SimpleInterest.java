package com.java11assignment;

interface SimpleInterests {
	double simpleInterests(double p, double t, double r);
}

public class SimpleInterest {

	public static void main(String[] args) {
		SimpleInterests si = (p, t, r) -> (p * t * r) / 100;
		System.out.println("Simple interest is  :" + si.simpleInterests(1000, 2, 5));
		
	}

}
