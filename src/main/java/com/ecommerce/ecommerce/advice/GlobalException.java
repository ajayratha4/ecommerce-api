package com.ecommerce.ecommerce.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecommerce.ecommerce.common.Response;

@ControllerAdvice
public class GlobalException {

	@Autowired
	Response response;

	@ExceptionHandler
	public ResponseEntity<Response> handleException(Exception e) {

		response.setError(e.getMessage());
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(response);
	}

}
