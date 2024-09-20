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
		super(message);
		
	}

	public InvalidOrderException(Throwable cause) {
		super(cause);
		
	}

	@Override
	public String toString() {
		return "Invalid Order1";
	}

}
