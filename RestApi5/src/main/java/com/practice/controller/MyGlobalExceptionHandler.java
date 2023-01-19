package com.practice.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.practice.entity.ErrorResponse;
import com.practice.exception.EmployeeNotFound;

@RestControllerAdvice
public class MyGlobalExceptionHandler {

	
	@ExceptionHandler(value = {EmployeeNotFound.class})
	public ErrorResponse studentNotFound(EmployeeNotFound ex) {
		
		ErrorResponse error=new ErrorResponse();
		error.setStatusmsg(HttpStatus.NOT_FOUND);
		error.setDatetime(LocalDateTime.now());
		error.setMsg(ex.getMessage());
		return error;
		
	}
	
	@ExceptionHandler(value = {HttpRequestMethodNotSupportedException.class})
	public ErrorResponse methodtNotSupport(HttpRequestMethodNotSupportedException ex) {
		
		ErrorResponse error=new ErrorResponse();
		error.setStatusmsg(HttpStatus.METHOD_NOT_ALLOWED);
		error.setDatetime(LocalDateTime.now());
		error.setMsg(ex.getMessage());
		return error;
		
	}
	
	
	@ExceptionHandler(value = {Exception.class})
	public ErrorResponse handleException(Exception ex) {
		
		ErrorResponse error=new ErrorResponse();
		error.setStatusmsg(HttpStatus.BAD_REQUEST);
		error.setDatetime(LocalDateTime.now());
		error.setMsg(ex.getMessage());
		return error;
		
	}
}
