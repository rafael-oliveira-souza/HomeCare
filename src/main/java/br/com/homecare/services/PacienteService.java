package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.homecare.models.entities.Paciente;
import br.com.homecare.repositories.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repo;

	public Optional<Paciente> buscar(Long id) {
		return this.repo.findById(id);
	}

	public List<Paciente> getAll() {
		return this.repo.findAll();
	}

	public Paciente salvar(Paciente entity) {
		return this.repo.save(entity);
	}
}
