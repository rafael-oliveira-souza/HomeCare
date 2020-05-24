package br.com.homecare.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.homecare.config.security.JwtUtil;
import br.com.homecare.models.entities.Profissao;
import br.com.homecare.services.AuthService;
import br.com.homecare.services.ProfissaoService;
import br.com.homecare.utils.ProfileUtils;

@RestController
@RequestMapping("/auth")
public class AuthResource {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthService service;


	@PostMapping("/refresh-token")
	@PreAuthorize(ProfileUtils.HAS_ROLE_ADMIN)
	public ResponseEntity<Profissao> save(@RequestBody Profissao Profissao) {

		return ResponseEntity.ok().body(null);
	}
}
