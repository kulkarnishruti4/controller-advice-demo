# Spring Boot Global Exception Handling with @ControllerAdvice

This project demonstrates how to implement global exception handling and model binding in a Spring Boot application using the `@ControllerAdvice` annotation.

## Features

- **Global Exception Handling**: Centralized handling of exceptions across all controllers.
- **Model Attribute Binding**: Shared model attributes available to all controllers.
- **Custom Error Responses**: Standardized error response format for API clients.
- **Pre-Processing and Post-Processing**: Logic that can be applied before and after controller methods.

## Project Structure

com.example.demo 
└── DemoApplication.java # Main application entry point 
└── entity
  └── Response.java
└── controller 
  └── DemoController.java # Example controller showcasing various endpoints 
└── exception 
  └── GlobalExceptionHandler.java # Global exception handler for managing exceptions 
  └── CustomResourceNotFoundException.java # Custom exception for handling resource not found scenarios   
