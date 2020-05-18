package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Medicamento;
import br.com.homecare.repositories.MedicamentoRepository;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class MedicamentoService {

	@Autowired
	private MedicamentoRepository repo;

	public Optional<Medicamento> buscar(Long id) {
		return this.repo.findById(id);
	}

	public List<Medicamento> getAll() {
		return this.repo.findAll();
	}

	public Medicamento salvar(Medicamento entity) {
		return this.repo.save(entity);
	}
}
