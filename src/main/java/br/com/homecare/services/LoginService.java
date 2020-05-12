package br.com.homecare.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.homecare.models.entities.Usuario;
import br.com.homecare.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;

	public Usuario login(Usuario usuario) {
		
		return usuario;
	}

	public Optional<Usuario> buscar(Long id) {
		return this.repo.findById(id);
	}

}
