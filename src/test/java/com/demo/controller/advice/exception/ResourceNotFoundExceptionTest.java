package com.demo.controller.advice.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ResourceNotFoundExceptionTest {
	
	
	 @Test
	    public void testResourceNotFoundExceptionMessage() {
	        String message = "Resource not found";
	        CustomResourceNotFoundException exception = new CustomResourceNotFoundException(message);
	        assertEquals(message, exception.getMessage());
	    }

}
