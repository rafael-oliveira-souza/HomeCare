package br.com.homecare.core.exceptions.handlers;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.homecare.core.exceptions.StandardError;
import br.com.homecare.core.exceptions.custom.RequestErrorException;

@ControllerAdvice
public class RequestErrorExceptionHandler {

	@ExceptionHandler(RequestErrorException.class)
    public ResponseEntity<StandardError> standardError(RequestErrorException e, HttpServletRequest request, HttpServletResponse response) {
    	StandardError error = new StandardError(INTERNAL_SERVER_ERROR.value(), e.getMessage(), e.getClass().getName(), request.getMethod(), System.currentTimeMillis());
   
    	return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(error);
    }

	@ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> dataIntegrityError(RequestErrorException e, HttpServletRequest request, HttpServletResponse response) {
    	StandardError error = new StandardError(BAD_REQUEST.value() , e.getMessage(), e.getClass().getName(), request.getMethod(), System.currentTimeMillis());
    
    	return ResponseEntity.status(BAD_REQUEST).body(error);
    }

	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<StandardError>> methdoArgumentNotValidError(MethodArgumentNotValidException e, HttpServletRequest request, HttpServletResponse response) {
		List<StandardError> errors = getErrors(BAD_REQUEST.value(), e, request);
		
    	return ResponseEntity.status(BAD_REQUEST).body(errors);
    }

	@ExceptionHandler(SQLException.class)
    public ResponseEntity<StandardError> sqlError(RequestErrorException e, HttpServletRequest request, HttpServletResponse response) {
    	StandardError error = new StandardError(BAD_REQUEST.value() , e.getMessage(), e.getClass().getName(), request.getMethod(), System.currentTimeMillis());
    
    	
    	return ResponseEntity.status(BAD_REQUEST).body(error);
    }
	
	
	public List<StandardError> getErrors(Integer status, MethodArgumentNotValidException e, HttpServletRequest request) {
		List<StandardError> errors = new ArrayList<StandardError>();
		
		for( FieldError error: e.getBindingResult().getFieldErrors()) {
			errors.add(new StandardError(status, error.getField(), error.getDefaultMessage(), request.getMethod(), System.currentTimeMillis()));
		}
		
		
		return errors;
	}
}
