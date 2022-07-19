package com.example.demo.exception;

@SuppressWarnings("serial")
public class APIException extends RuntimeException {
	public APIException(String message) {
		super(message);
	}
}
