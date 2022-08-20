package com.ty;

public class InsufficientFundException extends RuntimeException {
	String message;
	public InsufficientFundException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return ""+message;
	}
}
