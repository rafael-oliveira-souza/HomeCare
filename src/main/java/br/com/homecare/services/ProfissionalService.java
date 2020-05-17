package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.homecare.models.entities.Profissional;
import br.com.homecare.repositories.ProfissionalRepository;

@Service
public class ProfissionalService {
	
	@Autowired
	private ProfissionalRepository repo;

	public Optional<Profissional> buscar(Long id) {
		return this.repo.findById(id);
	}

	public List<Profissional> getAll() {
		return this.repo.findAll();
	}
	
	public Profissional salvar(Profissional entity) {
		return this.repo.save(entity);
	}

}
