package br.com.homecare.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;

	public Optional<Pessoa> buscar(Long id) {
		
		return this.repo.findById(id);
	}

}
