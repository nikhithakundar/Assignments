package com.lambdaassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Lambda5 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>(Arrays.asList("How","Are","You"));
		StringBuilder sb=new StringBuilder();
		list.forEach(word->sb.append(word.charAt(0)));
		String result=sb.toString();
		System.out.println(result);
		
		}

	}


