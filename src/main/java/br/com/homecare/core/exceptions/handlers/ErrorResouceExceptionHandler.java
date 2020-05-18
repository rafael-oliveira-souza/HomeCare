package br.com.homecare.core.exceptions.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.homecare.core.exceptions.StandardError;
import br.com.homecare.core.exceptions.custom.RequestErrorException;

@ControllerAdvice
public class ErrorResouceExceptionHandler {
	private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

	@ExceptionHandler(RequestErrorException.class)
    public ResponseEntity<StandardError> toResponse(RequestErrorException e, HttpServletRequest request, HttpServletResponse response) {
    	StandardError error = new StandardError(status.value() , e.getMessage(), request.getMethod(), System.currentTimeMillis());
    
    	return ResponseEntity.status(status).body(error);
    }
}
