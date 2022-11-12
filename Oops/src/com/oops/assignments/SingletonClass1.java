package com.oops.assignments;

public class SingletonClass1 {
private static SingletonClass1 uniqueInstance;
    
	public String str;
	private SingletonClass1() {
	}
    
	
	public static synchronized SingletonClass1 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonClass1();
		}
		return uniqueInstance;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass1 single1=SingletonClass1.getInstance();
		single1.str="Hi I am the singleton class String";
	    System.out.println("First reference: "+single1.str);
	    SingletonClass1 single2=SingletonClass1.getInstance();
	    single2.str="Nikhitha";
	    System.out.println("Second reference: "+single2.str);
	}

}
