package com.jonas.bookstore.resources.exceptions;

public class StandardError {
	
	private Long timestamp;
	private Integer status;
	private String error;
	
	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardError(Long timestamp, Integer status, String error) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	

}
