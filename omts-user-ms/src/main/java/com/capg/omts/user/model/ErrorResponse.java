package com.capg.omts.user.model;

import java.util.Date;

public class ErrorResponse {

	private  Date date;
	private String message;
	private String status;
	private int error;
	private String path;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	 public ErrorResponse() {
		// TODO Auto-generated constructor stub
	}
	public ErrorResponse(Date date, String message, String status, int error, String path) {
		super();
		this.date = date;
		this.message = message;
		this.status = status;
		this.error = error;
		this.path = path;
	}
	 
	
}