package com.wipro.vm.util;

public class ItemOutOfStockException extends Throwable {
    


	public ItemOutOfStockException() {
		super();
		
	}

	public ItemOutOfStockException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	
	}

	public ItemOutOfStockException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ItemOutOfStockException(String message) {
		super("Item Out Of Stock"+message);
		
	}

	public ItemOutOfStockException(Throwable cause) {
		super(cause);
		
	}

	@Override
	public String toString() {
		return "Item Out Of Stock";
	}

}
