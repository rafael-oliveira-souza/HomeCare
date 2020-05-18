package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.repositories.PessoaRepository;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;

	public Optional<Pessoa> buscar(Long id) {
		return this.repo.findById(id);
	}

	public List<Pessoa> getAll() {
		return this.repo.findAll();
	}

	public Pessoa salvar(Pessoa entity) {
		return this.repo.save(entity);
	}

}
