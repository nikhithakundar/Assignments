package com.practice.exception;

public class EmployeeNotFound extends Exception
{

	public EmployeeNotFound() {
		super();
	}

	

	public EmployeeNotFound(String message) {
		super(message);
		
	}

	public EmployeeNotFound(Throwable cause) {
		super(cause);
		
	}

	
	
}
