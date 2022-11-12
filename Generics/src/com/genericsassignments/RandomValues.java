package com.genericsassignments;

import java.util.HashMap;

public class RandomValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,Double> hm1 = new HashMap<> (11);
         hm1.put(12,56.8);
         hm1.put(5,24.89);
         hm1.put(102,565.8);
         hm1.put(40,16.08);
         hm1.put(189,66.05);
         hm1.put(10,2.003);
         hm1.put(34,43.89);
         hm1.put(23,67.078);
         hm1.put(84,98.45);
         hm1.put(22,55.88);
         System.out.print(new StringBuilder().append("Mappping of HashMap hm1 =").append(hm1).toString());
	}

}
