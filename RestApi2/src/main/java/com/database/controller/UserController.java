package com.database.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.check.Uservalid;

@RestController
public class UserController {
	Uservalid u=new Uservalid();
	@RequestMapping("/user/{user}/pass/{pass}")
	public String valid(@PathVariable String user,@PathVariable String pass) {
		if(u.userval(user,pass))
			return "valid";
		else
			return "Invalid";
					
	}
	
}
	
