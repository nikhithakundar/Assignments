package com.practice.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse
{
	private HttpStatus statusmsg;
	private String msg;
	private LocalDateTime datetime;
	public HttpStatus getStatusmsg() {
		return statusmsg;
	}
	public void setStatusmsg(HttpStatus statusmsg) {
		this.statusmsg = statusmsg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "ErrorResponse [statusmsg=" + statusmsg + ", msg=" + msg + ", datetime=" + datetime + "]";
	}
	
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public ErrorResponse(HttpStatus statusmsg, String msg, LocalDateTime datetime) {
		super();
		this.statusmsg = statusmsg;
		this.msg = msg;
		this.datetime = datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	
	

}
