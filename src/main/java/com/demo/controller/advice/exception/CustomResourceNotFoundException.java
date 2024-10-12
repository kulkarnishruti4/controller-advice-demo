package com.demo.controller.advice.exception;

public class CustomResourceNotFoundException extends RuntimeException {


	public CustomResourceNotFoundException(String message) {
		super(message);
	}

}
