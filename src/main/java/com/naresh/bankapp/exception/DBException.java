package com.naresh.bankapp.exception;

public class DBException extends Exception{

	public DBException(String message) {
		super(message);
	}
	
	public DBException(String message, Throwable e) {
		super(message, e);
	}
}
