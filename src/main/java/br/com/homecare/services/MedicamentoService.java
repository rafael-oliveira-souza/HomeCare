package br.com.homecare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Medicamento;
import br.com.homecare.repositories.MedicamentoRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class MedicamentoService {

	@Autowired
	private MedicamentoRepository repo;

	public Optional<Medicamento> find(Long id) {
		return this.repo.findById(id);
	}

	public List<Medicamento> getAll() {
		return this.repo.findAll();
	}
	
	public List<Medicamento> saveAll(List<Medicamento> list) {
		 return this.repo.saveAll((Iterable<Medicamento>)list);
	}
	
	public Medicamento save(Medicamento entity) {
		try { 
			return this.repo.save(entity);
		}catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}
	
	public Medicamento update(Medicamento entity) {
		if (entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Medicamento> objeto = this.find(entity.getId());
		if (objeto.isPresent()) {
			return this.repo.save(entity);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Medicamento"));
		}
	}

	public void delete(final Long id) {
		if (id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Medicamento> objeto = this.repo.findById(id);
		if (objeto.isPresent()) {
			this.repo.delete(objeto.get());
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Medicamento"));
		}
	}
}
