package com.lambdaassignment;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Lambda6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		list.add("Raju");
		list.add("Savi");
		list.add("Shwetha");
		list.add("Sanju");
		list.replaceAll(String::toUpperCase);
		System.out.println(list);
	}

}
