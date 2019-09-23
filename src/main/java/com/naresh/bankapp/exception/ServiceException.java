package com.naresh.bankapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ServiceException extends RuntimeException{

	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(String message, Throwable e) {
		super(message, e);
	}
}