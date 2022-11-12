package com.genericsassignments;

public class PairDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pair<String,String> myobj=new Pair<String,String>("1","hello");
	        myobj.setkey("1");
	        myobj.setvalue("hello");
	        System.out.println("key:"+myobj.getkey());
	        System.out.println("value:"+myobj.getvalue());
	}

}
