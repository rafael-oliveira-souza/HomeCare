package br.com.homecare.utils.exceptions.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.homecare.utils.exceptions.StandardError;
import br.com.homecare.utils.exceptions.custom.ErrorResouceException;

@ControllerAdvice
public class ErrorResouceExceptionHandler {
	private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

	@ExceptionHandler(ErrorResouceException.class)
    public ResponseEntity<StandardError> toResponse(ErrorResouceException e, HttpServletRequest request, HttpServletResponse response) {
    	if(response.getStatus() > 0) {
        	status = HttpStatus.valueOf(response.getStatus());
    	}
   
    	StandardError error = new StandardError(status.value() , e.getMessage(), System.currentTimeMillis());
    
    	return ResponseEntity.status(status).body(error);
    }
}
