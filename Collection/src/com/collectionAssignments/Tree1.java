package com.collectionAssignments;

import java.util.TreeMap;

public class Tree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Long,String>map=new TreeMap<Long,String>();
		TreeMap<Long,String>Name=new TreeMap<Long,String>();
		TreeMap<Long,String>email=new TreeMap<Long,String>();
		TreeMap<Long,Enum>Gender=new TreeMap<Long,Enum>();
		
		map.put(9458787749L, "Sujatha");
		map.put(9556378647L, "Roshan");
		map.put(9759373746L, "Ayush");
		map.put(9456378749L, "Sowmya");
		System.out.println("The keys of the given treemap is"+map.keySet());
		System.out.println("The Values of the given treemap is"+map.values());
		System.out.println("The key/value pair is"+map.entrySet());
		
		Name.put(9145367879L, "vani");
		Name.put(9234587679L, "savi");
		Name.put(8736367675L, "Rani");
		Name.put(9545367986L, "reshma");
		Name.put(9647653790L, "gowri");
		
		System.out.println("The keys of the given treemap is"+Name.keySet());
		System.out.println("The Values of the given treemap is"+Name.values());
		System.out.println("The key/value pair is"+Name.entrySet());
		
		email.put(9145657893L, "sanket@gmail.com");
		email.put(9456278390L, "sam4366@gmail.com");
		email.put(9564782923L, "vinay737@gmail.com");
		email.put(9745658093L, "tanu847@gmail.com");
		email.put(9243674859L, "sandeep536@gmail.com");
		
		System.out.println("The keys of the given treemap is"+email.keySet());
		System.out.println("The Values of the given treemap is"+email.values());
		System.out.println("The key/value pair is"+email.entrySet());
		
	}

}
