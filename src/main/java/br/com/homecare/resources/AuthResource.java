package br.com.homecare.resources;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthResource {

	private AuthService service;


	@PostMapping("/refresh-token")
	public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
		this.service.refreshToken(response);
		
		return ResponseEntity.noContent().build();
	}
}
