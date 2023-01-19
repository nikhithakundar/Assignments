package com.database.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.zipcode.Zipcode;

@RestController
public class ZipController {
	@RequestMapping("/add/{zipcode}")
	public Zipcode add(@PathVariable int zipcode) {
		HashMap<Integer,Zipcode>address=new HashMap<>();
		address.put(890000, new Zipcode("KA","Kundapura","India"));
		address.put(850000, new Zipcode("KA","Byndoor","India"));
		address.put(870000, new Zipcode("KA","Udupi","India"));
		
		return address.get(zipcode);
	}

}
