package br.com.homecare.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Pessoa;
import br.com.homecare.repositories.PessoaRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
@Transactional(rollbackFor = RequestErrorException.class)
public class PessoaService {

	@Autowired
	private PessoaRepository repo;

	public Optional<Pessoa> find(Long id) {
		return this.repo.findById(id);
	}

	public List<Pessoa> saveAll(List<Pessoa> entities) {
		return this.repo.saveAll(entities);
	}

	public List<Pessoa> getAll() {
		return this.repo.findAll().stream()
				.map(pessoa-> pessoa.getPessoa())
				.collect(Collectors.toList());
	}

	public Pessoa save(Pessoa entity) {
		try {
			return this.repo.save(entity);
		} catch (Exception e) {
			throw new RequestErrorException(e.getMessage());
		}
	}

	public Pessoa update(Pessoa entity) {
		if (entity.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Pessoa> objeto = this.find(entity.getId());
		if (objeto.isPresent()) {
			return this.repo.save(entity);
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Pessoa"));
		}
	}

	public void delete(final Long id) {
		if (id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}

		Optional<Pessoa> objeto = this.repo.findById(id);
		if (objeto.isPresent()) {
			this.repo.delete(objeto.get());
		} else {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Pessoa"));
		}
	}
}
