package com.genericsassignments;

import java.util.ArrayList;
import java.util.Collections;

public class Array{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<String>();
		  
		  //Add the values in Array List
		  arr.add("Hi");
		  arr.add("How are you");
		  arr.add("Goodbye");
		  
		  //display Array List before swapping
		  System.out.println("Before swapping the ArrayList");
		  System.out.println(arr);
		   Collections.swap(arr, 1, 2);
		   
		//display Array List before swapping
		   System.out.println("After swapping the ArrayList");
		   System.out.println(arr);


	}

}
