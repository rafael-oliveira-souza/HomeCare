package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Doenca;
import br.com.homecare.repositories.DoencaRepository;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class DoencaService {

	@Autowired
	private DoencaRepository repo;

	public Optional<Doenca> buscar(Long id) {
		return this.repo.findById(id);
	}

	public List<Doenca> getAll() {
		return this.repo.findAll();
	}

	public Doenca salvar(Doenca entity) {
		return this.repo.save(entity);
	}
}
