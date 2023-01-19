package com.demo;

public class HelloWorld {
	String message;

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
        this.message = message;
    }
	
	public void myInit() {
		System.out.println("My Custom initialisation");
		
	}
	public void myDestroy() {
		System.out.println("My destroy method");
	}
	@postConstruct
	public void myJavaInit() {
		System.out.println("This is my java initialisation");
	}
	@preDestroy
	public void myJavaDestroy() {
		System.out.println("it is my java destroy");
	}
	
}
