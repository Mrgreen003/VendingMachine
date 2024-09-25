package com.wipro.vm.util;

public class InvalidOrderException extends Throwable {
	

	public InvalidOrderException() {
		super();
		
	}

	public InvalidOrderException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InvalidOrderException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidOrderException(String message) {
		super("Invalid Order"+message);
		
	}

	public InvalidOrderException(String message,boolean b) {
		super("Item Out Of Stock");
		
	}

	@Override
	public String toString() {
		return "Invalid Order";
	}

}
