package com.lambdaassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.HashMap;

public class Lambda7 {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		map.put("a", 4);
		map.put("b", 2);
		map.put("c", 3);
		
		Lambda7 keyvalue=new Lambda7();
		keyvalue.convertKeyValueToString(map);
	}
	public void convertKeyValueToString(HashMap<String, Integer>map) {
		StringBuilder str=new StringBuilder();
		Consumer<Map.Entry>consumer=(p)->str.append(p.getKey()).append(p.getValue());
		Set set=map.entrySet();
		set.stream()
		.forEach(consumer);
		System.out.println(str);
		
	}
}
