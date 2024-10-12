package com.demo.controller.advice.entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@ToString
public class Response {

	public Response(HttpStatus status, String message, String description) {
		//You dont need to write this if you are using Lombok. This is an example
		this.status = status;
		this.message = message;
		this.description = description;
	}
	
	
	private HttpStatus status;
	private String 	message;
	private String description;
}
