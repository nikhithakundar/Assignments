package com.database.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	int a,b;

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public double div(int a,int b) {
		return a/b;
	}
	public double sqt(int a) {
		return Math.sqrt(a);
	}
}
