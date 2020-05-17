package br.com.homecare.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.homecare.utils.exceptions.StandardError;
import br.com.homecare.utils.exceptions.custom.ErrorResouceException;

public class CustomResponseEntity<T>{
	
	
//	
//    public ResponseEntity body() {
//    	super.bo
//    	if(response.getStatus() > 0) {
//        	status = HttpStatus.valueOf(response.getStatus());
//    	}
//   
//    	StandardError error = new StandardError(status.value() , e.getMessage(), System.currentTimeMillis());
//    
//    	return ResponseEntity.status(status).body(error);
//    }

}
