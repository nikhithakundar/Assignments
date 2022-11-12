package com.genericsassignments;

public class PairDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair1<String ,java.util.Date> myobj=new Pair1<String ,java.util.Date>("hello there",new java.util.Date());
	       // myobj.setkey("hello there");
	        myobj.setvalue(new java.util.Date());
	        System.out.println("key:"+myobj.getkey());
	        System.out.println("value:"+myobj.getvalue());

	}

}
