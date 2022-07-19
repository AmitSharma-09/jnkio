package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalException {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ExceptionHandler(Exceptionnotfound.class)
	public ResponseEntity<?>  handleExceptionnotEntityfound
	(Exceptionnotfound exception,WebRequest request){
		
		Edescription edescription=new Edescription(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity(edescription,HttpStatus.NOT_FOUND);
	}
}
